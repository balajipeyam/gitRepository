package builtInRules;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;

import testCases.MyClass;
import testCases.TestMyClass;

public class TempFolder {

	static File file;
	File folder;

	@Rule
	public TemporaryFolder temp = new TemporaryFolder(new File("file.txt"));

	@Rule
	public TestName testName = new TestName();

	@Rule
	public Timeout timeOut = new Timeout(15000);

	@Rule
	public ExpectedException e = ExpectedException.none();

	MyClass m = new MyClass();
	// @BeforeClass
	// public static void beforeClass(){
	// System.out.println("Inside before class : " + file.exists());
	// }

	// @Before
	// public void before(){
	// System.out.println("Inside before : " + file.exists());
	// }
	//
	@After
	public void after() {
		System.out.println("Inside after : " + file.exists());
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Inside after class : " + file.exists());
	}

	@Test
	public void test1() throws IOException, InterruptedException {
		//file = temp.newFile("file.txt");
		folder = temp.newFolder("folder");
		System.out.println("Inside test method : " + file.exists());
		System.out.println(testName.getMethodName() + "");
		e.expect(ArithmeticException.class);
		e.expectMessage("/ by zero");
		m.divide(6, 0);
	}

}
