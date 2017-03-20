package com.raj.spring;

public class TracksCoach implements Coach{
	
	private FortuneService fortuneService;
	private String teamName;
	private String emailID;

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

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
