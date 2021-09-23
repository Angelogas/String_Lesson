package com.luv2code.springdemo;

public class NewDayFortuneService implements FortuneService{
    @Override
    public String getFortuneService() {
        return "Today is a new day";
    }
}
