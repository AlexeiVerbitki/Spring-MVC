package annotationPackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("fortune.properties")

public class ConfigClass {
	
	@Value("${fortune1}")
	String fortune;
	
	@Bean
	public BadFortuneService badFortuneService() {
		return new BadFortuneService(fortune);
	}

	@Bean
	public SwimmingCoach swimmingCoach() {
		return new SwimmingCoach(badFortuneService());
	}

}
