package com.luv2code.springdemo;

public class CardioCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for email address and team
		private String emailAddress;
		private String team;
		
		//create a no-arg constructor
		public CardioCoach() {
			System.out.println("CardioCoach: inside no-arg constructor");
		}
		
		// our setter method
		public void setFortuneService(FortuneService fortuneService) {
			System.out.println("CardioCoach: inside setter method - setFortuneService");
			this.fortuneService = fortuneService;
		}
	
	public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			System.out.println("CardioCoach: inside setEmailAddress setter method");
			this.emailAddress = emailAddress;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			System.out.println("CardioCoach: inside setTeam setter method");
			this.team = team;
		}

	@Override
	public String getDailyWorkout() {
		return "Do cardio at 80% of max heart rate";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
