package customRules;

import org.junit.rules.ExternalResource;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class PerformanceLogger extends ExternalResource {
	private long testStart;
    private String testName;

	@Override
	protected void after() {
		System.out.printf("%s executed in: %dms%n", testName, System.currentTimeMillis() - testStart);
		super.after();
	}

	@Override
	protected void before() throws Throwable {
		testStart = System.currentTimeMillis();
		super.before();
	}

	@Override
	public Statement apply(Statement base, Description description) {
		 testName = description.getMethodName();
		 return super.apply(base, description);
	}
}

