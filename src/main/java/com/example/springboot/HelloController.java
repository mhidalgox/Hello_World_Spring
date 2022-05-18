package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class to implement profiling
 * for dev & prod profiles
 */
@RestController
public class HelloController {

	//welcome message
	@Value( "${spring.default.welcomeMessage}" )
	private String welcomeMessage;

	// current active profile
	@Value("${spring.profiles.active}")
	private String activeProfile;

	/**
	 * Appends active profile to Hello world message
	 * and returns
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "Hello World " + "from " + activeProfile;
	}

}
