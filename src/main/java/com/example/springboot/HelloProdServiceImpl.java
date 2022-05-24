package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Hello Service implementation for Prod Profile
 */
@Component
@Profile("prod")
public class HelloProdServiceImpl implements HelloService{

    // welcome message
    @Value( "${spring.default.welcomeMessage}" )
    private String welcomeMessage;

    //current active profile
    @Value("${spring.profiles.active}")
    private String activeProfile;

    /**
     * returns welcome message with current class name
     * @return
     */
    @Override
    public String getWelcomeMessage() {
        return "Hello world " + welcomeMessage + " from " + this.getClass().getSimpleName();
    }
}
