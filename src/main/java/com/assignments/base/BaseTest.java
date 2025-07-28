package com.assignments.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.assignments.utils.ConfigReader;
import com.assignments.utils.ExtentManager;
import com.assignments.utils.WaitUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	WaitUtils utils;
	ExtentManager test;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		WaitUtils.waitele(driver);
		driver.get(ConfigReader.getProperty("url"));
	}
	
	 @AfterSuite
	    public void generateReport() {
	        ExtentManager.getExtentReports().flush();
	    }
	
	@AfterMethod
	public void close()
	{
//		driver.quit();
		driver.close();
	}
}
