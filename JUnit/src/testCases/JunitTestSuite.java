package testCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestMyClass.class, TestMyClass2.class, sample.Fixtures.class })
public class JunitTestSuite {

}

/*@RunWith(Suite.class)
@Suite.SuiteClasses({ TestMyClass.class, TestMyClass2.class, sample.Fixtures.class })
class JunitTestSuite1 {

}*/