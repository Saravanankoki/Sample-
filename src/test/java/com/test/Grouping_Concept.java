package com.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "Non Veg")       
	public void chicken() {

		System.out.println("Chicken");

	}
	@Test(groups = "Non Veg") 
	public void fish() {

		System.out.println("Fish");

	}
	@Test(groups = "Non Veg") 
	public void prawn() {

		System.out.println("Prawn");

	}

	@Test (groups = "Veg")
	public void panneer() {

		System.out.println("Panneer");

	}
	@Test (groups = "Veg")
	public void shawarma() {

		System.out.println("Shawarma");

	}
	@Test(groups = "Vehicles")
	public void car() {
		System.out.println("Car");

	}
	@Test(groups = "Vehicles")
	public void bike() {
		System.out.println("Bike");
	}




}
