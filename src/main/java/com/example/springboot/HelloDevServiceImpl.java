package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class HelloDevServiceImpl implements  HelloService{

    @Value( "${spring.default.welcomeMessage}" )
    private String welcomeMessage;

    @Value("${spring.profiles.active}")
    private String activeProfile;
    @Override
    public String getWelcomeMessage() {
        return welcomeMessage + " from " + this.getClass().getName();
    }
}
