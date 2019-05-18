package mani.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach= context.getBean("myCricketCoach",CricketCoach.class);

		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//call new methods with literals
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		//close context
		context.close();
	}

}
