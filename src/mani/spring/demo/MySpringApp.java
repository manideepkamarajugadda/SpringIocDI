package mani.spring.demo;

public class MySpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object
		Coach theCoach = new TrackCoach();
		
		// use object
		System.out.println(theCoach.getDailyWorkout());
	}

}
