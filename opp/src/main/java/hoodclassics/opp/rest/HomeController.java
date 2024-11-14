package hoodclassics.opp.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {
/*
	@GetMapping("/")
	public ModelAndView welcome() {
		return new ModelAndView("forward:index.html");
	}
	*/
	
	@GetMapping("/")
	public String hello() { return "Hello";}
}
