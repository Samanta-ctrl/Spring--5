package com.SpringDemo;

public class MyApp 
{
	public static void main(String[] args) 
	{
		//create the object of BaseballCoach class
		Coach ch=new CricketCoach();
		
		//use the object
		System.out.println(ch.getDailyWorkout());
	}
}
