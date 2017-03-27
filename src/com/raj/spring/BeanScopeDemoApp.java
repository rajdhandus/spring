package com.raj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public BeanScopeDemoApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean compareResult = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same result? - " + compareResult);
		System.out.println("Memory Location - theCoach - " + theCoach);
		System.out.println("Memory Location - theCoach - " + alphaCoach);
		
		context.close();
		
	}

}
