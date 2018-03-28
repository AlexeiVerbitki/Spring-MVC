public class BaseballCoach implements Coach {

	FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public BaseballCoach() {
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
