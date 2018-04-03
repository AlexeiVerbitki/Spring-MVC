package annotationPackage;
public interface Coach {

	public String getDailyWorkout();
	
	default String getDailyFortune() {
		return "We have a dedicated fortune service, ask them!";
	}
	
}
