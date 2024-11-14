package hoodclassics.opp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import hoodclassics.opp.dao.UserRepository;
import hoodclassics.opp.domain.CustomUser;
import hoodclassics.opp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<CustomUser> listUsers() {
		return userRepo.findAll();
	}

	@Override
	public void registerUser(String username, String password) {
		String email = null;
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		password = encoder.encode(password);
		userRepo.save(new CustomUser(email, username, password));
	}

}
