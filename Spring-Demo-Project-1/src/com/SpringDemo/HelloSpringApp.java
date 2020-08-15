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
		
		
		//call methods on the bean
		System.out.println(ch.getDailyWorkout());
		
		//close the context
		context.close();
	}

}

/*

	getBean(String name, Class<T> requiredType) throws BeansException	

Return an instance, which may be shared or independent, of the specified bean.
Behaves the same as getBean(String), but provides a measure of type safety by throwing a BeanNotOfRequiredTypeException 
if the bean is not of the required type. This means that ClassCastException can't be thrown on casting the result correctly, 
as can happen with getBean(String).

Translates aliases back to the corresponding canonical bean name.

Will ask the parent factory if the bean cannot be found in this factory instance.

Parameters:
	name - the name of the bean to retrieve
	requiredType - type the bean must match; can be an interface or superclass

Returns: an instance of the bean

Throws:
NoSuchBeanDefinitionException - if there is no such bean definition
BeanNotOfRequiredTypeException - if the bean is not of the required type
BeansException - if the bean could not be created

*/