package hoodclassics.opp.domain;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class CustomUser {

	@Id
	@GeneratedValue
	private Long id;
	
	private String email;
	@Column(unique = true)
	@NonNull
	private String username;
	private String password;

	public CustomUser(String email, String username, String password) {
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	public CustomUser(String email, String username) {
		this.email = email;
		this.username = username;
		this.password = null;
	}

	//Spring ovo treba ali ne znam zašto
	public CustomUser() {
		this.email = null;
		this.username = null;
		this.password = null;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username="
				+ username + "]";
	}
	
}
