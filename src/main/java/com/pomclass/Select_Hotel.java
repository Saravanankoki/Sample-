package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement cont;
	
	public Select_Hotel(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getCont() {
		return cont;
	}

	
	
	

}
