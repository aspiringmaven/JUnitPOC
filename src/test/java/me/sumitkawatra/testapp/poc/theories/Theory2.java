package me.sumitkawatra.testapp.poc.theories;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Theory2 {
	
	@DataPoint public static String jack = "Jack";
	@DataPoint public static String jill = "Jill";
	@DataPoints public static String []names = new String[] {"Sumit","Dheeru","Karan","Bunty"}; 
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Theory
	public void test(String testName) {
		System.out.println(testName);
	}

}
