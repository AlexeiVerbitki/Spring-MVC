package annotationPackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SwimmingCoach implements Coach{

	BadFortuneService badFortuneService;
	
//	@Value("${fortune3}")
//	String fortuneString;
	
	
	
	public SwimmingCoach(BadFortuneService badFortuneService) {
				this.badFortuneService = badFortuneService;
	}



	@Override
	public String getDailyWorkout() {
				return "The Dunary isn't gonna swimm itself!";
	}
	
	@Override
	public String getDailyFortune() {
		return badFortuneService.getFortune();
//		return fortuneString;
		
	}

}
