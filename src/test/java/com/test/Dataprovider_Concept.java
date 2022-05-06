package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	@Test(dataProvider = "inputData")
	public void credentials(String username , String password) {

		System.out.println("Username ;" +username);

		System.out.println("Password :" +password);

	}	 
    @DataProvider
	public Object[][] inputData() {

		return new Object[][] {
			
			{"saravanan" , "245"},
			{"suganya" , "451"},
			{"gayathri" , "154"}


		};	
	}

}



