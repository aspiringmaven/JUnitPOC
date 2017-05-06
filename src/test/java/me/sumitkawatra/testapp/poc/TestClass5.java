package me.sumitkawatra.testapp.poc;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TestClass5 {

	@Test(timeout=1200)//milliseconds
	public void test() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
