package com.Maven_Project;

import java.io.IOException;
import java.text.DateFormat.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pomclass.Book_Hotel;
import com.pomclass.Login_Page;
import com.pomclass.Search_Hotel;
import com.pomclass.Select_Hotel;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;




public class Runner extends BaseClass {

	public static WebDriver driver = browserLaunch("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException  {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();

		urlLaunch(url);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserName();

		passInput(pom.getInstanceLogin().getUsername(), username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();

		passInput(pom.getInstanceLogin().getPassword(), password);

		clickOnElement(pom.getInstanceLogin().getLogin());

		selectByValue(pom.getInstanceSearch().getLocation(), "Los Angeles");

		selectByVisibleText(pom.getInstanceSearch().getHotel(), "Hotel Hervey");

		selectByVisibleText(pom.getInstanceSearch().getRoomtype(), "Double");

		selectByValue(pom.getInstanceSearch().getRoomno(), "2");

		clearTheElement(pom.getInstanceSearch().getCheckin());

		passInput(pom.getInstanceSearch().getCheckin(), "10/03/2022");

		clearTheElement(pom.getInstanceSearch().getCheckout());

		passInput(pom.getInstanceSearch().getCheckout(), "12/03/2022");

		selectByIndexMethod(pom.getInstanceSearch().getPeople(), 2);

		selectByValue(pom.getInstanceSearch().getChildroom(), "3");

		clickOnElement(pom.getInstanceSearch().getSubmit());

		clickOnElement(pom.getInstanceSelect().getRadiobutton());

		clickOnElement(pom.getInstanceSelect().getCont());
		
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstName();

		passInput(pom.getInstanceBook().getFn(), firstname);
		
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();

		passInput(pom.getInstanceBook().getLs(), lastname);
		
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();

		passInput(pom.getInstanceBook().getAdd(), address);
		
		String creditcardno = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCardNo();

		passInput(pom.getInstanceBook().getCrdnum(), creditcardno);

		selectByIndexMethod(pom.getInstanceBook().getCrdtype(), 2);

		selectByValue(pom.getInstanceBook().getExp(), "3");

		selectByValue(pom.getInstanceBook().getExpyr(), "2022");
		
		String cvvno = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvvNo();

		passInput(pom.getInstanceBook().getCvv(), cvvno);

		clickOnElement(pom.getInstanceBook().getB());






























	}
}