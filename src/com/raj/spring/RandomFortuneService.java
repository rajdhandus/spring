/**
 * 
 */
package com.raj.spring;

import java.util.Random;

/**
 * @author rajkumarpurushothaman
 *
 */
public class RandomFortuneService implements FortuneService {

	/**
	 * 
	 */
	
	private String[] fortuneArray = {"Good","Bad","Ugly"};
	
	public RandomFortuneService() {
		// TODO Auto-generated constructor stub
	}
	
	private int getRandomNumber(){
		Random rand = new Random();
		int n = rand.nextInt(3)+0;
		return n;
	}

	/* (non-Javadoc)
	 * @see com.raj.spring.FortuneService#getFortune()
	 */
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneArray[getRandomNumber()] + " fortune awaits you!!";
	}
	
	public static void main(String[] args){
		RandomFortuneService rfs = new RandomFortuneService();
		System.out.println(rfs.getFortune());
	}

}
