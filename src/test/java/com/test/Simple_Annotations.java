package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void propertySetting() {

		System.out.println("Property setting");
	}
	@BeforeTest
	public void browserLaunch() {

		System.out.println("Browser Launch");
	}
	@BeforeClass
	public void urlLaunch() {

		System.out.println("Url Launch");
	}
	@BeforeMethod
	public void signIn() {

		System.out.println("Sign In");
	}
	@Test(priority = -1)
	public void women() {

		System.out.println("Women");

	}
	@Test(priority = 0)
	public void men() {

		System.out.println("Men");
	}
	@Test(priority = 1,invocationCount  = 3)
	public void kids() {

		System.out.println("Kids");
	}
	@AfterMethod
	public void signout() {

		System.out.println("Sign out");

	}
	@AfterClass
	public void homePage() {

		System.out.println("Home Page");

	}
	@AfterTest
	public void deleteCookies() {

		System.out.println("Delete Cookies");

	}
	@AfterSuite
	public void quitBrowser() {

		System.out.println("Quit Browser");

	}





















}
