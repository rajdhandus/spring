/**
 * 
 */
package com.raj.spring;

/**
 * @author rajkumarpurushothaman
 *
 */
public interface Coach {
	
	public String getWorkoutInfo();
	public String getDailyFortune();
	public void setFortuneService(FortuneService theFortuneService);
	public String getEmailID();
	public String getTeamName();
}
