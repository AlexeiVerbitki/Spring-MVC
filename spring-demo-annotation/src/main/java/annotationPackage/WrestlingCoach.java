package annotationPackage;

import javax.jws.Oneway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wrestlingCoach")
public class WrestlingCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "One more piledriver never hurt nobody!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();

	}
}
