package com.raj.spring;

public class TracksCoach implements Coach{
	
	private FortuneService fortuneService;

	/**
	 * @param fortuneService
	 */
	public TracksCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Do gymnastics and cardio every day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
