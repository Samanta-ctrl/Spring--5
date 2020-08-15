package com.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp
{
	public static void main(String[] args)
	{
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from spring container
		
		Coach ch=context.getBean("myCoach",Coach.class); // myCoach -->bean id , Coach.class --> interface
		//When we pass the interface to the method, behind the scenes Spring will cast the object for you.
		
		//Here we create only one spring object (here ch object of Coach Interface) , with this object using get Bean() method we can pass
		//required bin id and corresponding its class name every time and get implementation of that particular class ,as per our requirement .
		
		
		//call methods on the bean
		System.out.println(ch.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
