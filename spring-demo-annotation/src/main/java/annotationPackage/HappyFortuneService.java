package annotationPackage;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		
		return "It's your lucky day, HappyFortuneService class is here to help!";
	}

}
