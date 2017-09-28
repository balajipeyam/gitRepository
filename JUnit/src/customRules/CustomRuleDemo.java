package customRules;

import org.junit.Rule;
import org.junit.Test;


public class CustomRuleDemo {

	@Rule
    public PerformanceLogger logger = new PerformanceLogger(); 

	
	@Test
	public void testMethod1() throws  InterruptedException {
		Thread.sleep(110);
	}

	@Test
	public void testMethod2() throws InterruptedException {
		Thread.sleep(1100);

	}

	
}
