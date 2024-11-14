package hoodclassics.opp.service;

import java.util.List;

import hoodclassics.opp.domain.CustomUser;

public interface UserService {
	List<CustomUser> listUsers();
	void registerUser(String username, String password);
}
