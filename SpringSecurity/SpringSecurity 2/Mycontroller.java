package com.example.springsecurity_2;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Controller;

@Controller
public class Mycontroller {
	
	
//	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String  hello() {
		return("hello world!");
		
	}

	@GetMapping("/user")
	public String  user() {
		return("<h1>Welcome to User..</h1>");
		
	}


	@GetMapping("/admin")
	public String  admin() {
		return("<h1>Welcome to Admin..</h1>");
		
	}

}
