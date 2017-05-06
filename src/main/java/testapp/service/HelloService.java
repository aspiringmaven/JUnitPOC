package testapp.service;

import java.util.Arrays;
import java.util.List;

import testapp.domain.Hello;

public class HelloService {
	
	

	public HelloService() {
		
	}
	
	public List<Hello> getGreetings() {
		System.out.println("Start getList Service");
		List<Hello> hellos =  Arrays.asList(new Hello[]{
				new Hello("Greeting 1"),
				new Hello("Greeting 2"),
				new Hello("Greeting 3"),
				new Hello("Greeting 4")
		});
		System.out.println("End getList Helper");
		return hellos;
	}
		
	public void save(Hello hello) {
		System.out.println("Save Service Start");
		
		System.out.println(hello);
		
		System.out.println("Save Service End");
	}
	

}
