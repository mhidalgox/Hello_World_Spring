package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class to implement step 4
 * by adding classes for each profile
 */
@RestController
public class HelloController {

	// injects Helloservice based on selected profile
	@Autowired
	private HelloService helloService;

	/**
	 * Calls current active profile hello service
	 * implementation and returns constructed message
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return helloService.getWelcomeMessage();
	}

}
