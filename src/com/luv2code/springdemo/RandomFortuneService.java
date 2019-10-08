package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		//call the getRandomFortuneGenerator
		return "A random fortune";
	}
	
	
}
