package me.sumitkawatra.testapp.poc.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import me.sumitkawatra.testapp.poc.parameterized.ArrayUtilTest;
import me.sumitkawatra.testapp.poc.parameterized.FactorialTest;

@RunWith(Suite.class)
@SuiteClasses({ ArrayUtilTest.class, FactorialTest.class })
public class ParameterizedTestSuite {

}
