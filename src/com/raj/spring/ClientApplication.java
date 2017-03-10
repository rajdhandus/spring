package com.raj.spring;

public class ClientApplication {
	
	
	
	public static void main(String[] args)
	{
		Coach theCoach = new BaseballCoach();
		String workout = theCoach.getWorkoutInfo();
		System.out.println(workout);
	}

}
