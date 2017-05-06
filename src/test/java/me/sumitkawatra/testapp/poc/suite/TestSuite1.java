package me.sumitkawatra.testapp.poc.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import me.sumitkawatra.testapp.poc.TestClass1;
import me.sumitkawatra.testapp.poc.TestClass2;
import me.sumitkawatra.testapp.poc.TestClass3;
import me.sumitkawatra.testapp.poc.TestClass4;
import me.sumitkawatra.testapp.poc.TestClass5;

@RunWith(Suite.class)
@SuiteClasses({ TestClass1.class, TestClass2.class, TestClass3.class, TestClass4.class, TestClass5.class })
public class TestSuite1 {

}
