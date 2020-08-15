package com.SpringDemo;

public class TrackCoach implements Coach 
{
	@Override
	public String getDailyWorkout()
	{
		System.out.println("I'm Track Coach and I'm ordering you to: ");
		return "Run minimum 2Km";
	}

}
