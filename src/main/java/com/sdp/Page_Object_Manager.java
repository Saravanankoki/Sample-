package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Book_Hotel;
import com.pomclass.Login_Page;
import com.pomclass.Search_Hotel;
import com.pomclass.Select_Hotel;

public class Page_Object_Manager {


	public WebDriver driver;

	private Login_Page lp;


	public  Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		
	}

	public Login_Page getInstanceLogin() {

		if (lp== null) {

			lp = new Login_Page(driver);

		}
		return lp;

	}

	private Search_Hotel sh;

	public Search_Hotel getInstanceSearch() {

		if (sh==null) {

			sh = new Search_Hotel(driver);

		}
		return sh;

	}

	private Select_Hotel sl;

	public Select_Hotel getInstanceSelect() {

		if (sl==null) {

			sl = new Select_Hotel(driver);

		}
		return sl;
	}

	private Book_Hotel bh;

	public Book_Hotel getInstanceBook() {

		if (bh==null) {

			bh = new Book_Hotel(driver);

		}
		return bh;

	}





















}
