/*Practice Activity #7 - Inversion of Control and Dependency Injection with Java Code

  Note: In this practice activity, do not use component scanning.

Create a new Coach implementation.
Create a new fortune service implementation (return a single hard-coded fortune)

Create a Java configuration class to perform IoC and DI with those classes.

Develop a main application to retrieve your coach implementation.
Test your application and verify your coach implementation is wired up as desired.*/

package annotationPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class JavaAnnotationApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

		Coach coach = context.getBean("swimmingCoach", SwimmingCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		
		BadFortuneService badFortuneService = context.getBean("badFortuneService", BadFortuneService.class);
		System.out.println(badFortuneService.getFortune());
		context.close();

	}
}
