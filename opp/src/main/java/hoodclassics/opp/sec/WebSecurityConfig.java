package hoodclassics.opp.sec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import hoodclassics.opp.dao.UserRepository;
import hoodclassics.opp.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity(debug = true)
public class WebSecurityConfig {

	@Autowired
	private UserRepository userRepo;
	
	System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	
	@Bean
	@Order(1)
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.securityMatcher("/api/**", "/login/**")
		.csrf(AbstractHttpConfigurer::disable)
				.authorizeHttpRequests(auth -> auth
						.anyRequest().authenticated())
				.formLogin(Customizer.withDefaults());                                                                                                                                                                                                                                        ;
		
		return http.build();
	}

	@Bean
	@Order(2)
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(AbstractHttpConfigurer::disable) // TODO: Naći bolji način za "odzabraniti" (ne vratiti 403) POST
													// requestove
				.authorizeHttpRequests(authorizeRequests -> authorizeRequests
						.requestMatchers("/", "/index.html", "/assets/**").permitAll()
						.anyRequest().authenticated())
				.oauth2Login(config -> config.clientRegistrationRepository(this.clientRegistrationRepository())
						.userInfoEndpoint(userInfo -> userInfo.userService(this.oauth2UserService()))
						.successHandler(new SimpleUrlAuthenticationSuccessHandler("/")));
		return http.build();
	}

	private OAuth2UserService<OAuth2UserRequest, OAuth2User> oauth2UserService() {
		final DefaultOAuth2UserService delegate = new DefaultOAuth2UserService();
		return userRequest -> {
			OAuth2User retUser = delegate.loadUser(userRequest);

			// stvaramo objekt User koji ćemo spremiti u bazu podataka
			String name = retUser.getAttribute("given_name");
			String surname = retUser.getAttribute("family_name");
			String email = retUser.getAttribute("email");
			String username = name + surname;
			CustomUser newUser = new CustomUser(name, surname, email, username);

			if (!userRepo.findByEmail(email).isPresent()) {
				userRepo.save(newUser);
			}

			return retUser;
		};
	}

	@Bean
	public ClientRegistrationRepository clientRegistrationRepository() {
		return new InMemoryClientRegistrationRepository(this.googleClientRegistration());
	}

	private ClientRegistration googleClientRegistration() {
		return ClientRegistration.withRegistrationId("google").clientId(this.getClientID("google"))
				.clientSecret(this.getClientSecret("google"))
				.clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
				.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
				.redirectUri("{baseUrl}/login/oauth2/code/{registrationId}").scope("profile", "email") // openid NI POD
																										// KOJU CIJENU
																										// ne smije tu
																										// biti
				.authorizationUri("https://accounts.google.com/o/oauth2/v2/auth")
				.tokenUri("https://www.googleapis.com/oauth2/v4/token")
				.userInfoUri("https://www.googleapis.com/oauth2/v3/userinfo")
				.userNameAttributeName(IdTokenClaimNames.SUB).jwkSetUri("https://www.googleapis.com/oauth2/v3/certs")
				.clientName("Google").build();
	}

	/*
	 * TODO: Naći bolji način za izvesti ovo. Možda povezati s bazom podataka.
	 * Trenutno samo čita iz google.txt datoteke (nije na GitHubu).
	 */
	private String getClientID(String provider) {
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(Paths.get("src/main/resources/secrets/" + provider + ".txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines.get(0);
	}

	private String getClientSecret(String provider) {
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(Paths.get("src/main/resources/secrets/" + provider + ".txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines.get(1);
	}

}
