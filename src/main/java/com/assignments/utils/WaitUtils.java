
package com.assignments.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assignments.base.BaseTest;

public class WaitUtils extends BaseTest{

	public static WebElement waitForVisible(WebDriver driver, By locator, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForClickable(WebDriver driver, By locator, int timeout) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }
    
    public static void waitele(WebDriver driver)
    {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    
    public static void Thread(WebDriver driver) throws InterruptedException
    {
    	Thread.sleep(5000);
    }
    
    public static void Scroll(WebDriver driver)
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
    }
}
