package com.assignments.test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.assignments.base.BaseTest;
import com.assignments.pages.ProductPage;
import com.assignments.pages.RoomStatus;
import com.assignments.utils.WaitUtils;

public class ProductTest extends BaseTest{
	WebDriverWait wait;
	@Test
	public void TestLogin() throws InterruptedException
	{
		com.assignments.pages.LoginPage loginpage=new com.assignments.pages.LoginPage(driver);
		ProductPage productpage=new ProductPage(driver);
		RoomStatus status=new RoomStatus(driver);
		loginpage.login("1000.test1@uandiholidays.com","1234");
		WaitUtils.waitele(driver);
		productpage.SelectProduct();
		status.BasicValueCheck();
	}
}
