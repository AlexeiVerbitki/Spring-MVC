/*1. Define a new implementation for the FortuneService.

Your fortune service should read the fortunes from a file.
The fortune service should load the fortunes into an array
When the getFortune() method is called it would return a random fortune from the array.
2. Inject your new dependency into your Coach implementation

3. Test your application to verify you are getting random fortunes based on your fortunes file.*/

package annotationPackage;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Value("${fortune1}")
	String fortune1;
	@Value("${fortune2}")
	String fortune2;
	@Value("${fortune3}")
	String fortune3;

	SecureRandom random = new SecureRandom();

	int index;

	@Override
	public String getFortune() {
		String[] fortuneArray = { fortune1, fortune2, fortune3 };

		return fortuneArray[random.nextInt(fortuneArray.length)];
	}

}
