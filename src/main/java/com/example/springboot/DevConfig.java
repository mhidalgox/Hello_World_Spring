package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {


    @Bean
    public HelloService HelloService(){
        return new HelloDevServiceImpl();
    }
}
