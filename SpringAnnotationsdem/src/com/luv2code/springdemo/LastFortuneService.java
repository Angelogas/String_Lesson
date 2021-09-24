package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LastFortuneService implements FortuneService{
    @Override
    public String getFortuneService() {
        return "it is another change to accomplish your day";
    }
}
