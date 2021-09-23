package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan ("com.luv2code.springdemo")
public class SportConfig {
    // define bean for our new day fortune service
    @Bean
    public FortuneService newDayFortuneService () {
        return new NewDayFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(newDayFortuneService());
    }

    @Bean
    public Coach tennisCoach() {
        return new TennisCoach(newDayFortuneService());
    }
}
