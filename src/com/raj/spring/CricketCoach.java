package com.raj.spring;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String teamName;
	private String emailID;
	
	public CricketCoach() {
		System.out.println("Inside No Arg Constructor");
	}
	
	/**
	 * @param fortuneService
	 */
	public CricketCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("Inside setTeamName Service");
		this.teamName = teamName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		System.out.println("Inside setEmailID Service");
		this.emailID = emailID;
	}

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
		System.out.println("Inside SetFortune Service");
		this.fortuneService = theFortuneService;
	}
	
	public void doAtTheBeginning(){
		System.out.println("Inside the method - doAtTheBeginning");
	}
	
	public void doAtTheEnd(){
		System.out.println("Inside the method - doAtTheEnd");
	}

}
