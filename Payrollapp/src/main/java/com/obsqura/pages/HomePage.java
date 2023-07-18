package com.obsqura.pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.utilities.*;

public class HomePage extends PageUtility {
	WebDriver driver;
	@FindBy(xpath = "//a[text()='Carol Thomas']")
	WebElement profile;
	@FindBy(xpath = "//div[@class='col-sm-2 logo']")
	WebElement logo;
	@FindBy(xpath = "//*[@id='w1']/li[3]/a")
	WebElement client;
	@FindBy(xpath = "//header/div[2]/div/div/nav/div/div[2]/ul/li[4]/a")
	WebElement workers;
	WaitUtility wu;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyElementsOnHomePage() {
	
		wu = new WaitUtility(driver);
		wu.waitforVisibilityofElement(profile);
		wu.waitforVisibilityofElement(logo);
		
		if (profile.isDisplayed() && logo.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void clickClient() {
		wu = new WaitUtility(driver);
		wu.waitforVisibilityofElement(client);
		client.click();
	}

	
	  public void clickWorkers() { 
		 wu = new WaitUtility(driver);
		 wu.waitforVisibilityofElement(workers); 
		 workers.click();
	  
	  
	  }
	 

}