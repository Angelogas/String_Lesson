package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;

@Component
public class SwimCoach implements Coach{

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        System.out.println("Inside SwimCoach constructor");
        this.fortuneService = fortuneService;
    }

//    @Autowired
    @Qualifier ("happyFortuneService")
    public void setEmail(FortuneService email) {
        System.out.println(">> SwimCoach: inside set method");
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
