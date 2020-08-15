package com.SpringDemo;

public class FootballCoach implements Coach
{
	@Override
	public String getDailyWorkout()
	{
		System.out.println("I'm Football Coach and I'm ordering you to: ");
		return "do a goal practice within 10 minutes";
	}
}
