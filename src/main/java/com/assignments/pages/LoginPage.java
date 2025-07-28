package com.assignments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.assignments.base.BaseTest;
import com.assignments.utils.WaitUtils;

public class LoginPage extends BaseTest{
	
	public static By username=By.xpath("//input[@id='TxtEmailAgent']");
	public static By password=By.xpath("//input[@id='TxtPassAgent']");
	public static By loginBtn=By.xpath("//input[@id='BtnAgentLogin']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String usrname,String pass)
	{
		driver.findElement(username).sendKeys(usrname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
		WaitUtils.waitele(driver);
	}
}
