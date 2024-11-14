package hoodclassics.opp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CustomAuthController {
/*
	@GetMapping("/")
	public ModelAndView welcome() {
		return new ModelAndView("forward:index.html");
	}
	*/
	
	@GetMapping("/api/ping")
	public String hello() { return "OK";}
}
