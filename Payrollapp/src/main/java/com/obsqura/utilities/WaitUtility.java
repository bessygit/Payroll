package com.obsqura.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitUtility {

	WebDriver driver;

	public WaitUtility(WebDriver driver) {
		this.driver = driver;

	}
	public void IW_ImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void waitforVisibilityofElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitforElementtobeClickable(WebElement ele1) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele1));
	}
	public void waitforPresenceofElement(By path,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(path));
	}
	
	

}
