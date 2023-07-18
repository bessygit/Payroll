package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class LoginPage extends PageUtility {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='loginform-username']")
	WebElement username;
	@FindBy(xpath = "//*[@id='loginform-password']")
	WebElement password;
	@FindBy(xpath = "//*[@id='login-form']/div[5]/button")
	WebElement loginbutton;
	@FindBy(xpath = "//p[text()='Incorrect username or password.']")
	WebElement errmsg;
	WaitUtility wu;

	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickUsername() {
		username.click();
	}

	public void enterUsername(String user_name) {
		username.sendKeys(user_name);
	}

	public void clickPassword() {
		password.click();
	}

	public void enterPassword(String pass_word) {
		password.sendKeys(pass_word);
	}

	public void login(String user_name, String pass_word) {
		enterPassword(pass_word);
		enterUsername(user_name);
		loginbutton.click();
		
	}
	public boolean verifyUnSuccessfullLogin() {
		wu = new WaitUtility(driver);
		wu.waitforVisibilityofElement(errmsg);
		if (errmsg.isDisplayed()) {
			return true;
		}
		return false;
	}
		
	
}
