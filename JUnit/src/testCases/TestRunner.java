package testCases;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) 
	{ 
		
		Result result = JUnitCore.runClasses(TestMyClass.class); 
		
		for (Failure failure : result.getFailures()) 
		{ 
			System.out.println(failure.toString()); 
		}
		
		System.out.println("Success :" +result.wasSuccessful()); 
		System.out.println("RunCount :"+ result.getRunCount());
		System.out.println("FailCount :"+ result.getFailureCount());
		System.out.println("Runtime:"+ result.getRunTime());
	}

}
