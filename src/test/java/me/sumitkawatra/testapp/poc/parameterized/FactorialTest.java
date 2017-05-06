package me.sumitkawatra.testapp.poc.parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import testapp.Factorial;

@RunWith(Parameterized.class)
public class FactorialTest {
	
	private int input;
	private int output;

	/**
	 * @param input
	 * @param output
	 */
	public FactorialTest(int input, int output) {
		super();
		this.input = input;
		this.output = output;
	}
	
	@Parameters
	public static Collection<Object[]> factorialData() {
		return Arrays.asList(new Object[][] { 
			{0,1},
			{1,1},
			{2,2},
			{3,6},
			{4,24}
		});
	}


	@Test
	public void test() {
		assertEquals(new Factorial().fact(input), output);
	}

}
