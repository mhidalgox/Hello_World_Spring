package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**Controller class to implement step 5 to
 *Use configuration classes to create bean from pojo
 */
@RestController
public class HelloController {


	@Autowired
	private HelloService helloService;

	/**
	 * Endpoint to read from , to & message provided
	 * and send a welcome message by creating message pojo
	 * @param from
	 * @param to
	 * @param message
	 * @return
	 */
	@GetMapping("/message/{from}/{to}/{message}")
	public String index(@PathVariable("from") String from , @PathVariable("to") String to,
						@PathVariable("message") String message) {
		return helloService.getWelcomeMessage(from, to,message);
	}

}
