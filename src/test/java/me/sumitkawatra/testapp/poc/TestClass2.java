package me.sumitkawatra.testapp.poc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestClass2 {
	
	private String str1;
	private String str2;
	private Object nullObj;
	private Object notNull;

	@Before
	public void setUp() throws Exception {
		str1 = "Hello";
		str2 = new String("Hello");
		nullObj = null;
		notNull = new Object();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIfObjectsAreEqual() {
		//it will check equals method
		assertEquals(str1, str2);
	}
	
	@Test
	public void toTestIfObjectIsNull() {
		assertNull(nullObj);
	}
	
	@Test
	public void toTestIfObjectIsNotNull() {
		assertNotNull(notNull);
	}
	
	@Test
	public void testIfNotSame() {
		//it will check !=
		assertNotSame(str1, str2);
	}

	@Test
	@Ignore
	public void testIfSame() {
		//it will check == and result would be false
		assertSame(str1, str2);
	}
	
	
}
