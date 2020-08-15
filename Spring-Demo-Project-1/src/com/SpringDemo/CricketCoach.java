package com.SpringDemo;

public class CricketCoach implements Coach
{
	@Override
	public String getDailyWorkout()
	{
		System.out.println("I'm Cricket Coach and I'm ordering you to: ");
		return "spend 1 hour in net practice and then do an YOYO test";
	}
}
