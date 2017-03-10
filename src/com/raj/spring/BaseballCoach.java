package com.raj.spring;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Spend 30 mins in Batting cage";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
