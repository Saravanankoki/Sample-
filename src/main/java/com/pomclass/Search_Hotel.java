package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomno;
	
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	
	@FindBy(id = "adult_room")
	private WebElement people;
	
	@FindBy(id = "child_room")
	private WebElement childroom;
	
	@FindBy(id = "Submit")
	private WebElement submit;
	
	public Search_Hotel(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getPeople() {
		return people;
	}

	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return submit;
	}

	
	
	

}
