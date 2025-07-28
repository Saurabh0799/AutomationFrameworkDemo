package com.assignments.test;

import org.testng.annotations.Test;

import com.assignments.base.BaseTest;

public class LoginTest extends BaseTest{

	@Test
	public void TestLogin()
	{
		com.assignments.pages.LoginPage loginpage=new com.assignments.pages.LoginPage(driver);
//		loginpage.login("standard_user","secret_sauce");
		loginpage.login("1000.test1@uandiholidays.com", "1234");
	}
}
