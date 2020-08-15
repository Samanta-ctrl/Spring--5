package com.SpringDemo;

public class HockeyCoach implements Coach 
{
	@Override
	public String getDailyWorkout()
	{
		System.out.println("I'm Hockey Coach and I'm ordering you to: ");
		return "practice much harder";
	}
}
