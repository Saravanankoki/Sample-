package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;

	@FindBy(name = "first_name")
	private WebElement fn;
	
	@FindBy(name = "last_name")
	private WebElement ls;
	
	@FindBy(name = "address")
	private WebElement add;
	
	@FindBy(name = "cc_num")
	private WebElement crdnum;
	
	@FindBy(id = "cc_type")
	private WebElement crdtype;
	
	@FindBy (id = "cc_exp_month")
	private WebElement exp;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyr;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id ="book_now")
	private WebElement b;
	
	
	public Book_Hotel(WebDriver driver5) {
		this.driver = driver5;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLs() {
		return ls;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCrdnum() {
		return crdnum;
	}

	public WebElement getCrdtype() {
		return crdtype;
	}

	public WebElement getExp() {
		return exp;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getB() {
		return b;
	}

	
	

}
