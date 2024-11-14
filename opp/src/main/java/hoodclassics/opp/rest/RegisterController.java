package hoodclassics.opp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hoodclassics.opp.service.UserService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public void register(@RequestParam String username, @RequestParam String password) {
		userService.registerUser(username, password);
	}
	
}
