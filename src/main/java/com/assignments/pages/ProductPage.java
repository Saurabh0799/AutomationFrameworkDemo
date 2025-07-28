package com.assignments.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.assignments.base.BaseTest;
import com.assignments.utils.WaitUtils;

public class ProductPage extends BaseTest {

	public static By ClickSelectDestination=By.xpath("//select[@id='Search1_DrpCountry']");//click on Select Destination
	public static By SelectDestArea=By.xpath("(//option[contains(text(),'Indonesia')])[2]");//Select Indonesia
	
	public static By ClickonSelectCity=By.xpath("//select[@id='Search1_DrpCity']");//Click on select city
	public static By SelectCity=By.xpath("//option[contains(text(),'Bali')]");//Select City
	public static By SelectCityXpath=By.xpath("//*[@id=\"Search1_DrpCity\"]/option[2]");
	
	//input[@id='Search1_txtCheckIn']
	public static By ClickOnCheckInDate=By.xpath("//select[@id='Search1_DrpCity']");//Click on Check inDate
	public static By clickOncheckinDatexpath=By.xpath("<a class=\"ui-state-default ui-state-active\" href=\"#\">31</a>");
	
	public static By ClickOnCheckOutDate=By.xpath("//input[@id='Search1_txtCheckOut']");//checkout date
	public static By ClickOnCheckOutDatexpath=By.xpath("<a class=\"ui-state-default\" href=\"#\">2</a>");//checkout date
	
	//click on Nights
	public static By nights=By.xpath("//input[@id='Search1_TxtNights']");//Nights

	//Click on Adults
	public static By ClickOnAdults=By.xpath("//select[@id='Search1_RptAddRoom_ctl00_DrpAdult']");
	public static By SelectAdults=By.xpath("//option[contains(text(),'4')]");//select adults
	
	//click on Child
	public static By clickOnChild=By.xpath("//select[@id='Search1_RptAddRoom_ctl00_DrpChild']");//clck on child
	public static By selectChild=By.xpath("(//option[contains(text(),'3')])[3]");
	
	//click on search button
	public static By Searchbtn=By.xpath("//input[@id='Search1_BtnSearch']");

	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void SelectProduct() throws InterruptedException
	{
        driver.findElement(ClickSelectDestination).click();
        driver.findElement(SelectDestArea).click();
        
        WaitUtils.waitForClickable(driver, ClickonSelectCity, 10);
        Thread.sleep(3000);
        driver.findElement(ClickonSelectCity).click();
        WaitUtils.waitele(driver);
        try {
        driver.findElement(SelectCity).click();
        }catch (Exception e) {
			// TODO: handle exception
        	driver.findElement(SelectCityXpath).click();
		}
        
        WaitUtils.waitele(driver);
        try {
        driver.findElement(ClickOnCheckInDate).sendKeys("31-Jul-2025");
        }catch (Exception e) {
			driver.findElement(clickOncheckinDatexpath).click();
		}
        WaitUtils.waitele(driver);
        driver.findElement(nights).clear();
        driver.findElement(nights).sendKeys("2");
        
        try {
        driver.findElement(ClickOnCheckOutDate).sendKeys("02-Aug-2025");
        }catch (Exception e) {
			// TODO: handle exception
        	driver.findElement(ClickOnCheckOutDatexpath).click();
		}
        
        WaitUtils.waitele(driver);
        driver.findElement(ClickOnAdults).click();
        driver.findElement(SelectAdults).click();
        
        WaitUtils.waitele(driver);
        driver.findElement(clickOnChild).click();
        driver.findElement(selectChild).click();
        
        WaitUtils.waitele(driver);
        driver.findElement(Searchbtn).click();
        
        WaitUtils.waitele(driver);
        
	}
}
