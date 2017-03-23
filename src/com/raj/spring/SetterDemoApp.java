package com.raj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCoach",CricketCoach.class);
		
		System.out.println(theCoach.getWorkoutInfo());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailID());
		System.out.println(theCoach.getTeamName());
		
		context.close();
	}

}
