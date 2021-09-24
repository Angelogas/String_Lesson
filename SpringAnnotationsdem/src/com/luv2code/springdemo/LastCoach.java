package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LastCoach implements Coach{

//    @Qualifier ("lastFortuneService")
    private LastFortuneService lastFortuneService;

    public LastCoach(LastFortuneService lastFortuneService) {
        System.out.println("Now in LastCoach constructor");
        this.lastFortuneService = lastFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return lastFortuneService.getFortuneService();
    }
}
