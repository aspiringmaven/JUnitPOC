package me.sumitkawatra.testapp.poc.theories;


import org.junit.After;
import org.junit.Before;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Theory1 {

	@Before
	public void setUp() throws Exception {
		System.out.println("B4");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Theory
	public void test() {
		System.out.println("Theory");
	}

}
