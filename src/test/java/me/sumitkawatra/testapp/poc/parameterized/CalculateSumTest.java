package me.sumitkawatra.testapp.poc.parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import testapp.CalculateSum;

@RunWith(Parameterized.class)
public class CalculateSumTest {
	
	public int a;
	public int b;
	public int c;
	public int result;
	
	

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @param result
	 */
	public CalculateSumTest(int a, int b, int c, int result) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.result = result;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(new CalculateSum().sum(a, b, c), result);
	}
	
	@Parameters
	public static List<Object[]> testData() {
		return Arrays.asList(new Object[][]{
			{1,2,3,6},
			{2,4,6,12},
			{1,1,1,9}
		});
	}
	
}
