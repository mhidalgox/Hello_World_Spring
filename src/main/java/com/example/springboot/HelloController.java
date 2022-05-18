package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class to define endpoints for homepage
 */
@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		// returning a simple message for homepage
		return "Hello World";
	}

}
