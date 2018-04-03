package annotationPackage;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationContext.xml");
		// create the object
		Coach coach = context.getBean("wrestlingCoach", Coach.class);
//		Coach coach2 = context.getBean("tennisCoach", Coach.class);

		// verify if they are the same object
//		if (coach == coach2) {
//			System.out.println("coach == coach2");
//		} else
//			System.out.println("coach != coach2");
		
//		 use the object
		 System.out.println(coach.getDailyWorkout());
		 System.out.println(coach.getDailyFortune());
		context.close();
		
	}

}
