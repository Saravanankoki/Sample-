package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void credentials1() {
		
		String exp = "Saravanan";
		
		String act = "Saravanan";  
		
		Assert.assertEquals(act, exp);
		
		

	}
	@Test                                                    //(retryAnalyzer = Rerun.class) 
	public void credentials2() {
		
		String exp = "214";
		String act =  "522";
		
		Assert.assertEquals(act, exp);

	}

}
