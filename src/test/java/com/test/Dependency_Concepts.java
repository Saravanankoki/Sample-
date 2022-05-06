package com.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concepts {
	//@Ignore         ocuuring exception
	@Test
	public void tenth() {
		System.out.println("tenth");
	}
	@Test(dependsOnMethods = "tenth")
	public void twelth() {
		System.out.println("Twelth");

	}
	



}
