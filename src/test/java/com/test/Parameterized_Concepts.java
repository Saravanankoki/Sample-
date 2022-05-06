package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concepts {
@Test
@Parameters({"username","password"})
	public void credentials(String username,String password ) {
		
		System.out.println("Username :" +username);
		
		System.out.println("Password :" +password);

	}
}
