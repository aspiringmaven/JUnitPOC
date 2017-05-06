package me.sumitkawatra.testapp.poc.mock;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;

import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

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
		
		//Mock Void object.
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invokation) throws Throwable {
				System.out.println(" Got you Mockito " + invokation.getArgument(0).toString());
				return null;
			}
		}).when(helloService).save(any(Hello.class));
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void toTestGetList() {
	
		List<Hello> hellos =  new HelloHelper(helloService).getGreetings();
		
		if(hellos.isEmpty()) fail("get List Fail");
		for(Hello h: hellos) {
			System.out.println(h);
		}
		
	}
	
	@Test
	public void toTestSave() {
	
		new HelloHelper(helloService).save(new Hello("To Save....."));
	}

}
