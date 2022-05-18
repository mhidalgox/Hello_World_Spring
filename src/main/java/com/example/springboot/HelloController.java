package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for step 2 with new endpoint to show welcome message
 */
@RestController
public class HelloController {

	// welcome message property defined in application.properties
	@Value( "${spring.default.welcomeMessage}" )
	private String welcomeMessage;

	/**
	 * Reads welcomemessage from application.properties & retuns
	 * a new message appended with Hello world
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		// appends welcomeMessage into Hello World and returns
		return "Hello World " + welcomeMessage;
	}

}
