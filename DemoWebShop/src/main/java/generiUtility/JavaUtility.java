package generiUtility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber() {
		Random ran = new Random();
		return ran.nextInt();
		
	}
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
		
	}

}
