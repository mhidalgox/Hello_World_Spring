package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Configuration class for Dev profile
 */
@Configuration
@Profile("dev")
public class DevConfig {

    /**
     * For Dev profile creates a bean from HelloDevServiceImpl
     * @return
     */
    @Bean
    public HelloService HelloService(){
        return new HelloDevServiceImpl();
    }
}
