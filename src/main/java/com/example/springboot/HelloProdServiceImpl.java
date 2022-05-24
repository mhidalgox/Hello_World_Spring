package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;

/**
 * Prod profile implementation for Hello Service
 */
public class HelloProdServiceImpl implements HelloService{

    int counter=1;

    @Value( "${spring.default.welcomeMessage}" )
    private String welcomeMessage;

    @Value("${spring.profiles.active}")
    private String activeProfile;
    @Override
    public String getWelcomeMessage(String from , String to , String message) {
        Message pojo = new Message();
        pojo.setMessage(message);
        pojo.setFrom(from);
        pojo.setTo(to);
        pojo.setId(counter);
        counter++;
        return "Hello world " + welcomeMessage + " from " + this.getClass().getSimpleName()+" " + pojo;
    }
}
