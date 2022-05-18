package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Configuration class for prod profile
 */
@Configuration
@Profile("prod")
public class ProdConfig {

    /**
     * Creates a bean HelloProdServiceImpl for prod profile
     * @return
     */
    @Bean
    public HelloService HelloService(){
        return new HelloProdServiceImpl();
    }
}
