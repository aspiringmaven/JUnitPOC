package me.sumitkawatra.testapp.poc.mock;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import testapp.domain.Hello;
import testapp.helper.HelloHelper;
import testapp.service.HelloService;

@RunWith(MockitoJUnitRunner.class)
public class HelloHelperTest {
	
	 @Mock public HelloService helloService;

	@Before
	public void setUp() throws Exception {
		when(helloService.getGreetings()).thenReturn(Arrays.asList(new Hello[]{
				new Hello("Mock Greeting 1"),
				new Hello("Mock Greeting 2"),
				new Hello("Mock Greeting 3"),
				new Hello("Mock Greeting 4"),
				new Hello("Mock Greeting 5")
		}));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void totest() {
	
		List<Hello> hellos =  new HelloHelper(helloService).getGreetings();
		
		
		for(Hello h: hellos) {
			System.out.println(h);
		}
		
	}

}
