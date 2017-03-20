package com.raj.spring;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	private String teamName;
	private String emailID;
	
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

	@Override
	public void setFortuneService(FortuneService theFortuneService) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEmailID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeamName() {
		// TODO Auto-generated method stub
		return null;
	}

}
