package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File("C:\\Users\\Sundar\\eclipse-workspace\\Training\\Maven_Project\\src\\main\\java\\com\\properties\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);   // read the file

		p = new Properties();     // get the file

		p.load(fis);        // load the file
	}

	public String getUrl() throws IOException {

		String url = p.getProperty("url");
		return url;

	}

	public String getUserName() throws IOException {

		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() throws IOException {

		String password = p.getProperty("password");
		return password;
	}

	public String getFirstName() throws IOException {

		String firstname = p.getProperty("firstname");
		return firstname;

	}

	public String getLastName() throws IOException {

		String lastname = p.getProperty("lastname");
		return lastname;

	}

	public String getAddress() throws IOException {

		String address = p.getProperty("address");
		return address;

	}


	public String getCreditCardNo() throws IOException {

		String creditcardno = p.getProperty("creditcardno");
		return creditcardno;
	}

	public String getCvvNo() throws IOException {

		String cvvno = p.getProperty("cvvno");
		return cvvno;


	}































}
