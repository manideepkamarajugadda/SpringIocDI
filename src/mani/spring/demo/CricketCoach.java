package mani.spring.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields
	
	private String emailAddress;
	private String team;
	
	
	
	// create a no arg constructor
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method- setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method- setTeam");

		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	// our setter method called by spring after dependency injection
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("CricketCoach : inside setter method- setFortuneService");
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkout() {

		return "Practice spin for 30 minutes a day";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
