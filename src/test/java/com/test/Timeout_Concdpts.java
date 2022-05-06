package com.test;

import org.testng.annotations.Test;

public class Timeout_Concdpts {
@Test(timeOut = 5000)
	public void demo() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("Browser Launch");
		Thread.sleep(1000);
		System.out.println("Url Launch");
		Thread.sleep(2000);
		System.out.println("Login");


	}


}
