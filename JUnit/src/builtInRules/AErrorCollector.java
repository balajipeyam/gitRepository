package builtInRules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class AErrorCollector {

	@Rule
	public final ErrorCollector collector = new ErrorCollector();

	@Test
	public void example() {
		collector.addError(new Throwable("first thing went wrong"));
		collector.addError(new Throwable("second thing went wrong"));
	}
}
