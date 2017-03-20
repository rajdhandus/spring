package com.raj.spring;

public class SoccerCoach implements Coach{
	
	private FortuneService fortuneService;

	/**
	 * @param fortuneService
	 */
	public SoccerCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Run for 30 mins every day";
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
