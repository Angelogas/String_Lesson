package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// read spring config file
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    // get the beam from spring container
    Coach theCoach = (TennisCoach) context.getBean("tennisCoach");

    // call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

    context.close();
    }
}
