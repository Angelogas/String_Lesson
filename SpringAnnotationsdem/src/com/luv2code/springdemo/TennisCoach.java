package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")
//public class TennisCoach implements Coach{
//
//    @Override
//    public String getDailyWorkout() {
//        return "Practice your backhand volley";
//    }

@Component
@Scope ("prototype")
public class TennisCoach implements Coach{
//    @Autowired
    @Qualifier ("fileFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        System.out.println("Now in TennisCoach constructor");
//        fortuneService = theFortuneService;
//    }

//    @Autowired
    public TennisCoach(/*@Qualifier("happyFortuneService")*/ FortuneService theFortuneService) {
        System.out.println("Now in TennisCoach constructor");
        this.fortuneService = theFortuneService;
    }

    // PostConstruct test out
    @PostConstruct
    public static void postBeanMessage() {
        System.out.println("TennisCoach bean has been created");
    }

    @PreDestroy
    public static void presDestroyMesaage() {
        System.out.println("TennisCoach is about to be destroyed");
    }


//    @Qualifier ("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Setter Injection");
        this.fortuneService = fortuneService;
    }

//    @Autowired
    @Qualifier ("happyFortuneService")
    public void DoSomeCrazyStuffs(FortuneService fortuneService) {
        System.out.println("Now in the DoSomeCrazyStuff Method of TennisCoach");
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