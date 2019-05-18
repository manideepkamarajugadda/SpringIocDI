package mani.spring.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {

		return "Sprint for a hard 5K";
	}

	@Override
	public String getDailyFortune() {

		return "Just Do It: "+ fortuneService.getFortune();
	}

}
