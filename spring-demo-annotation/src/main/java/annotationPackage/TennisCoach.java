package annotationPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	
//@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}



	@Override
	public String getDailyWorkout() {

		return "Practice that serve of yours!";
	}

	@Override
	public String getDailyFortune() {
				return fortuneService.getFortune();
	}
	

}
