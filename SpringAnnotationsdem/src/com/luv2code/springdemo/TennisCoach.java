package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
//public class TennisCoach implements Coach{
//
//    @Override
//    public String getDailyWorkout() {
//        return "Practice your backhand volley";
//    }

@Component
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier ("happyFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        System.out.println("Now in TennisCoach constructor");
//        fortuneService = theFortuneService;
//    }

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
        System.out.println("Now in TennisCoach constructor");
        this.fortuneService = theFortuneService;
    }

    @Autowired
    @Qualifier ("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Setter Injection");
        this.fortuneService = fortuneService;
    }

    @Autowired
    @Qualifier ("happyFortuneService")
    public void DoSomeCrazyStuffs(FortuneService fortuneService) {
        System.out.println("Now in the DoSomeCrazyStuff Method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}