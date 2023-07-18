package com.obsqura.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class WorkersPage extends PageUtility {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='w3']/li[4]/a")
	WebElement workers;
	@FindBy(xpath = "//section/div/div/div[1]/ul/li[2]")
	WebElement createworker;
	@FindBy(xpath = "//table/tbody/tr[1]/td[8]/a[3]")
	WebElement deleteicon;
	@FindBy(xpath = "//header/div[3]/div/div/div[1]/h1")
	WebElement dltepagerr;
	@FindBy(xpath = "//select[@id='worker-title']")
	WebElement title;
	PageUtility pu;
	WaitUtility wu;
	
	public WorkersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean verifyElementsOnWorkersPage() {
		if (workers.isDisplayed() && createworker.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public void deleteChoosedClient() {
		deleteicon.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		}
	public boolean verifyDeleteClient() {
		if (dltepagerr.isDisplayed()) {
			return true;
		}
		return false;
	}
	public void clickCreateWorker() {
		createworker.click();
		
	}
	public void enterValuesOnCreateWorker(WebElement ele, String value) {
		pu.selectDropDown(ele, value);
		
	}
	
	
		
		
	

}
