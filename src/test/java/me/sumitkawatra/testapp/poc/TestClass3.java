package me.sumitkawatra.testapp.poc;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class TestClass3 {

	//To Test 1 Exception
	@Test(expected=NullPointerException.class)
	public void test1() {
		throw new NullPointerException();
	}
	
	//To Test multiple Exception
	@Test
	public void test2() {		
		try {
			if(new Random().nextInt(12)%2 == 0) {
				throw new ClassCastException();
			} else {
				throw new NullPointerException();
			}
		} catch(Exception e) {
			assertTrue( (e instanceof NullPointerException) || (e instanceof ClassCastException));
		}		
	}

}
