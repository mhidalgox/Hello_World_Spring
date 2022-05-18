package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;

/**
 * Dev profile implementation for HelloService
 */
public class HelloDevServiceImpl implements  HelloService{

    // counter to increment meesage id
    int counter=1;

    // welcome message
    @Value( "${spring.default.welcomeMessage}" )
    private String welcomeMessage;

    // current active profile
    @Value("${spring.profiles.active}")
    private String activeProfile;

    /**
     * Creates pojo , sets properties & returns message
     * @param from
     * @param to
     * @param message
     * @return
     */
    @Override
    public String getWelcomeMessage(String from, String to , String message) {
        Message pojo = new Message();
        pojo.setMessage(message);
        pojo.setFrom(from);
        pojo.setTo(to);
        pojo.setId(counter);
        counter++;
        return welcomeMessage + " from " + this.getClass().getName()+" " + pojo;
    }
}
