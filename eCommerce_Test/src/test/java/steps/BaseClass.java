package steps;

import org.apache.commons.text.RandomStringGenerator;
public class BaseClass {
	
	//Generate random emails
	
	public static String randomString() {
		RandomStringGenerator generator = new RandomStringGenerator.Builder()
				 .withinRange('a', 'z').get();
				String randomLetters = generator.generate(20);
				return randomLetters ;
	}

}
