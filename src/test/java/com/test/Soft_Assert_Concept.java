package com.test;

import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	
	public void demo_Password() {
		
		String exp_Password = "dwhf254";
		
		String act_Password = "vsdna";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(act_Password, exp_Password);
		
		System.out.println("verification");

	}

}
