package me.sumitkawatra.testapp.poc;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class TestClass4 {
	
	private boolean isSonarRunning;

	@Before
	public void setUp() throws Exception {
		isSonarRunning = true;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assume.assumeTrue(isSonarRunning);
	}

}
