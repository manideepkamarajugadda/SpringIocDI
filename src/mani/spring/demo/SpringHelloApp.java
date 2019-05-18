package mani.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		// retrieve a bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call fortune method
		
		System.out.println(theCoach.getDailyFortune());
		//close context
		context.close();
	}

}
