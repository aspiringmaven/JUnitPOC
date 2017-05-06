package me.sumitkawatra.testapp.poc.parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import testapp.ArrayUtil;

@RunWith(Parameterized.class)
public class ArrayUtilTest {
	
	private int[] array;
	private int sum;

	/**
	 * @param array
	 * @param sum
	 */
	public ArrayUtilTest(int[] array, int sum) {
		super();
		this.array = array;
		this.sum = sum;
	}

	@Parameters
	public static Collection<Object[]> factorialData() {
		return Arrays.asList(new Object[][] { 
			{new int[]{1,2,3,4,5},15},
			{new int[]{2,2,2},6},
			{new int[]{0,0,0},0},
			{new int[]{1,1,1},3},
			{new int[]{12,12,12,-12},24}
		});
	}
	
	@Test
	public void test() {
		assertEquals(new ArrayUtil().sum(array), sum);
	}

}
