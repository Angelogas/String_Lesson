package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{

    @Override
    public String getFortuneService() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext ("applicationContext.xml");
//        context.getBean("");
        return null;
    }
}
