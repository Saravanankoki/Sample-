package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static Select s;

	// broswer launch
	public static WebDriver browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\driver\\chromedriver.exe");

			driver = new ChromeDriver();   // WebDriver is not in the syntax

			driver.manage().window().maximize();


		}
		else if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty(" webdriver.gecko.driver.", 
					System.getProperty("user.dir")+"\\driver\\firefoxdriver.exe");

			driver = new FirefoxDriver();

			driver.manage().window().maximize();
		}
		return driver;

	}
	public static void urlLaunch(String url) {  //get
		driver.get(url);


	}
	public static void closeTheBrowser() {     //close
		driver.close();
	}
	public static void passInput(WebElement element,String input) { //sendkeys
		element.sendKeys(input);

	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void selectByIndexMethod(WebElement element,int index) {

		s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByVisibleText(WebElement element,String text) {

		s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void selectByValue(WebElement element, String text1) {

		s = new Select(element);
		s.selectByValue(text1);

	}
	
public static void clearTheElement(WebElement element) {
	element.clear();
	

}
	}
	
		

	
















