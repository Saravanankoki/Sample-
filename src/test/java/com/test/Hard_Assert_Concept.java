package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Hard_Assert_Concept {
	
	public void demo_Username() {
		
		String exp_Username = "Gayathri";
		
		String act_Username = "Gayathri";
		
		 Assert.assertEquals(exp_Username, act_Username);
		 
	 System.out.println("validation");
		
		
		

	}

}
