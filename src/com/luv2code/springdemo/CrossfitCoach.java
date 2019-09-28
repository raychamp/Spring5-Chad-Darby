package com.luv2code.springdemo;

public class CrossfitCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Do the Friday Work Out of the Day";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

}
