package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@Autowired
	private HelloService helloService;

	@GetMapping("/message/{from}/{to}/{message}")
	public String index(@PathVariable("from") String from , @PathVariable("to") String to,
						@PathVariable("message") String message) {
		return helloService.getWelcomeMessage(from, to,message);
	}

}
