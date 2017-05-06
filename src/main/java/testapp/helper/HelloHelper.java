package testapp.helper;

import java.util.List;

import testapp.domain.Hello;
import testapp.service.HelloService;

public class HelloHelper {

	private HelloService helloService;

	public HelloHelper(HelloService helloService) {
		this.helloService = helloService;
	}

	public List<Hello> getGreetings() {
		System.out.println("Start getList Helper");
		List<Hello> hellos = helloService.getGreetings();
		System.out.println("End getList Helper");
		return hellos;

	}

	public void save(Hello hello) {
		System.out.println("Save helper start");

		helloService.save(hello);

		System.out.println("save helper end");
	}

}
