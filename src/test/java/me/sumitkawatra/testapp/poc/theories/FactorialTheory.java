package me.sumitkawatra.testapp.poc.theories;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class FactorialTheory {

	@DataPoints public static int[][] num = new int[][]{ {0,1}, {1,1}, {2,2}};
	
	
	@Test
	public void toTestFact(int num, int fact) {
		System.out.println("Number " + num + " Factorial " + fact);
	}

}
