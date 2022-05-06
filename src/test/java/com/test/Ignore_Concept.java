package com.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test(enabled = false)       //ignore type 1
	public void chicken() {

		System.out.println("Chicken");

	}
	@Test
	public void fish() {

		System.out.println("Fish");

	}
	@Test
	public void prawn() {

		System.out.println("Prawn");

	}
	@Ignore                   //ignore type 2
	@Test
	public void panneer() {
		
		System.out.println("Panneer");

	}
	@Test
	public void shawarma() {
		
		System.out.println("Shawarma");
	}









}
