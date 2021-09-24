package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// read spring config file through XML file
//    ClassPathXmlApplicationContext context =
//            new ClassPathXmlApplicationContext("applicationContext.xml");

    // read spring config file through Java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

    // get the beam from spring container
    Coach theCoach = (TennisCoach) context.getBean("tennisCoach");
    SwimCoach secondCoach = (SwimCoach) context.getBean("swimCoach");



    // call the method on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(secondCoach.getEmail());

    context.close();
        System.out.println("End of the Program");

        AnnotationConfigApplicationContext context7 =
                new AnnotationConfigApplicationContext(ConfigClassForQuestion7.class);
        Coach lastCoach = context7.getBean("lastCoach", Coach.class);

        System.out.println(lastCoach.getDailyFortune());
        context7.close();
    }

}
