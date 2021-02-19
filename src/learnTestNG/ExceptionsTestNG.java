package learnTestNG;

import org.testng.annotations.Test;

public class ExceptionsTestNG {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x = "110A";
		Integer.parseInt(x);
	}
	

}
