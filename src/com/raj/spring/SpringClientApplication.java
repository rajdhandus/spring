package com.raj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClientApplication {
	
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Coach theCoach = applicationContext.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getWorkoutInfo());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailID());
		System.out.println(theCoach.getTeamName());

		applicationContext.close();
	}
	

}
