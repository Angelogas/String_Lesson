package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClassForQuestion7 {

    @Bean
    public LastFortuneService lastFortuneService() {
        return new LastFortuneService();
    }

    @Bean
    public Coach lastCoach() {
        return new LastCoach(lastFortuneService());
    }
}
