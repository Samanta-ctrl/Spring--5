package com.SpringDemo;

public class BaseballCoach implements Coach
{
	@Override
	public String getDailyWorkout()
	{
		System.out.println("I'm Basketball Coach and I'm ordering you to: ");
		return "spend 30 minutes on batting practice";
	}
}
