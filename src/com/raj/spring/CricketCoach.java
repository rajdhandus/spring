package com.raj.spring;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String teamName;
	private String emailID;
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * @param fortuneService
	 */
//	public CricketCoach(FortuneService theFortuneService) {
//		super();
//		this.fortuneService = theFortuneService;
//	}

	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Spend every day in nets";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

	@Override
	public void setFortuneService(FortuneService theFortuneService) {
		// TODO Auto-generated method stub
		this.fortuneService = theFortuneService;
	}

}
