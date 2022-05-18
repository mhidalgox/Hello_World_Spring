package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Hello Service implementation for Dev Profile
 */
@Component
@Profile("dev")
public class HelloDevServiceImpl implements  HelloService{

    // welcome message
    @Value( "${spring.default.welcomeMessage}" )
    private String welcomeMessage;

    // active profile
    @Value("${spring.profiles.active}")
    private String activeProfile;

    /**
     * Returns welcome message appended by class name
     * @return
     */
    @Override
    public String getWelcomeMessage() {
        return welcomeMessage + " from " + this.getClass().getName();
    }
}
