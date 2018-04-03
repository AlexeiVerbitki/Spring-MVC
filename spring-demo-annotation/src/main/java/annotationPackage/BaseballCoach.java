package annotationPackage;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	
//constructor
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//default constructor
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
