/**
 * 
 */
package me.sumitkawatra.testapp.poc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


/**
 * @author sumitkawatra
 *
 */
public class TestClass1 {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test");
	}

	@Test
	public void testMethod1() {
		System.out.println("Test Method 1");
	}
	
	@Test
	@Ignore
	public void testMethod2() {
		fail("This Should Fail");
	}

}