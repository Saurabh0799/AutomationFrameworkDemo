package com.assignments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.assignments.base.BaseTest;
import com.assignments.utils.WaitUtils;

public class RoomStatus extends BaseTest{
	
	public static By ClickHotelRequestForm=By.xpath("//input[@id='btnOfflinePg']");//click Hotel Request Form
	public static By remark=By.xpath("//input[@id='txtnationality']");//Remark
	public static By closebtn=By.xpath("//input[@id='btnClose']");//Close
	
	//ckeck budget
	public static By budgetZore=By.xpath("//input[@id='ChkPrice_0']");
	public static By budgetOne=By.xpath("//input[@id='ChkPrice_1']");
	
	//room Category
	public static By roomCategory=By.xpath("//input[@id='chkroomcat_1']");
	
	//bathtub
	public static By bathtub=By.xpath("//input[@id='chkAddOns_0']");
	//pool Decoration
	public static By poolDecoration=By.xpath("//input[@id='chkAddOns_5']");
	
	
	
	
	public RoomStatus(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void BasicValueCheck() throws InterruptedException
	{
		WaitUtils.waitForVisible(driver, ClickHotelRequestForm, 10);
		driver.findElement(ClickHotelRequestForm).click();
		WaitUtils.Thread(driver);
		WaitUtils.Scroll(driver);
		driver.findElement(remark).sendKeys("Will Join!");
		WaitUtils.waitele(driver);
		driver.findElement(closebtn).click();
		
		WaitUtils.waitele(driver);
		driver.findElement(budgetZore).click();
		WaitUtils.waitele(driver);
		driver.findElement(budgetZore).click();
		WaitUtils.Thread(driver);
		driver.findElement(budgetOne).click();
		WaitUtils.Scroll(driver);
		
		driver.findElement(roomCategory).click();
		WaitUtils.Scroll(driver);
		
		WaitUtils.waitele(driver);
		driver.findElement(bathtub).click();
		WaitUtils.waitele(driver);
		driver.findElement(poolDecoration).click();
		
	}

}

