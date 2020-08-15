package com.SpringDemo;

public class MyApp 
{
	public static void main(String[] args) 
	{
		//create the object of BaseballCoach class
		Coach ch=new CricketCoach(); // with this traditional method we have to create new object everytime , whenever we try to access every class implementation.
		
		//use the object
		System.out.println(ch.getDailyWorkout());
	}
}
