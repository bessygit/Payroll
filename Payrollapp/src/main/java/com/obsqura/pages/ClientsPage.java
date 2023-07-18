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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class ClientsPage extends PageUtility {
	WebDriver driver;
	@FindBy(xpath = "//a[ text()='Home']")
	WebElement home;
	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createclient;
	@FindBy(xpath = "//input[@id='clientsearch-client_name']")
	WebElement clientname;
	@FindBy(id = "clientsearch-id")
	WebElement clientid;
	@FindBy(xpath = "//*[@id=\"w0\"]/div[3]/button[1]")
	WebElement searchbutn;
	@FindBy(xpath = "//*[text()='Haritha']")
	WebElement searchname;
	@FindBy(xpath = "//*[@id=\"w1\"]/table/tbody/tr[6]/td[1]")
	WebElement searchid;
	@FindBy(xpath = "//select[@id='client-branch_id']")
	WebElement branch;
	@FindBy(xpath = "//select[@id='client-division_id']")
	WebElement division;
	@FindBy(xpath = "//select[@id='client-invoice_order']")
	WebElement invoiceorder;
	@FindBy(xpath = "//*[@id=\"client-client_address\"]")
	WebElement clientaddress;
	@FindBy(xpath = "//input[@id='client-postcode']")
	WebElement postcode;
	@FindBy(xpath = "//select[@id='client-invoice_delivery_method']")
	WebElement invoicedeliverymethod;
	@FindBy(xpath = "//select[@id='client-master_document']")
	WebElement masterdocument;
	@FindBy(xpath = "//select[@id='client-vat_rate']")
	WebElement vatrate;
	@FindBy(id = "client-client_name")
	WebElement clientName;
	@FindBy(xpath = "//input[@id='client-invoice_contact']")
	WebElement invoicecontact;
	@FindBy(xpath = "//input[@id='client-phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='client-email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='client-company_reg']")
	WebElement companyreg;
	@FindBy(xpath = "//input[@id='client-settilement_days']")
	WebElement days;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebutn;
	@FindBy(xpath = "//header/div[3]/div/div/div[1]")
	WebElement bessy;
	@FindBy(xpath = "//*[@id='w1']/li[3]/a")
	WebElement client;
	@FindBy(xpath = "//*[@id='w1']/table/tbody/tr[1]/td[6]/a[1]")
	WebElement viewicon;
	@FindBy(xpath = "//header/div[3]/div/div/div[1]/h1")
	WebElement viewedclient;
	@FindBy(xpath = "//*[@id='w1']/table/tbody/tr[5]/td[6]/a[2]")
	WebElement updateicon;
	@FindBy(xpath="//header/div[3]/div/div/div[1]/h1")
	WebElement updatedclient;
	WaitUtility wu;

	public ClientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyElementsOnClientsPage() {
		 wu = new WaitUtility(driver);
		 wu.waitforVisibilityofElement(home);
		 wu.waitforVisibilityofElement(createclient);
		if (home.isDisplayed() && createclient.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void cilckClientname() {
		clientname.click();
	}

	public void enterClientname(String client_name) {
		clientname.sendKeys(client_name);
	}

	public void clickSearchbutn() {
		searchbutn.click();
	}

	public void searchByClientName(String client_name) {
		enterClientname(client_name);
		clickSearchbutn();
	}

	public void clickClientId() {
		clientid.click();
	}

	public void enterClientId(String client_id) {
		clientid.sendKeys(client_id);
	}

	public void searchByClientId(String client_id) {
		enterClientId(client_id);
		clickSearchbutn();
	}

	public boolean checkClientNameisDisplayed() {
		if (searchname.isDisplayed()) {
			return true;
		}
		return false;
	}

	public boolean checkClientIdisDisplayed() {
		if (searchid.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void clickCreateClient() {
		createclient.click();
	}

	public void selectBranchDropDown(WebElement ele, String value) {
		Select drp = new Select(branch);
		drp.selectByVisibleText(value);
	}

	public void selectDivisionDropDown(WebElement ele, String value) {
		Select divisiondrp = new Select(division);
		divisiondrp.selectByVisibleText(value);
	}

	public void enterClientName(String Name) {
		clientName.click();
		clientName.sendKeys(Name);
	}

	public void enterClientAddress(String addr) {
		clientaddress.sendKeys(addr);
	}

	public void enterPostCode(String code) {
		postcode.sendKeys(code);
	}

	public void enterInvoiceContact(String num) {
		invoicecontact.sendKeys(num);
	}

	public void enterPhoneNum(String phnum) {
		phone.sendKeys(phnum);

	}

	public void enterEmail(String emailaddr) {
		email.sendKeys(emailaddr);

	}

	public void enterCompanyRegNum(String regno) {
		companyreg.sendKeys(regno);
	}

	public void selectInvoiceOrderDropDown(WebElement ele, String value) {
		Select inordrp = new Select(invoiceorder);
		inordrp.selectByVisibleText(value);
	}

	public void selectInvoiceDeliveryMethodDropDown(WebElement ele, String value) {
		Select indeldrp = new Select(invoicedeliverymethod);
		indeldrp.selectByVisibleText(value);
	}

	public void selectMasterDocumentDropDown(WebElement ele, String value) {
		Select indeldrp = new Select(masterdocument);
		indeldrp.selectByVisibleText(value);
	}

	public void enterSettilementDay(String daysnum) {
		days.sendKeys(daysnum);
	}

	public void selectVatRateDropDown(WebElement ele, String value) {
		Select vrdrp = new Select(vatrate);
		vrdrp.selectByVisibleText(value);
	}

	public void clickSaveButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", savebutn);
	}

	
	public boolean verifyCreatedClientIsDisplayed() {
		wu=new WaitUtility(driver);
		wu.waitforVisibilityofElement(bessy);
		
		if (bessy.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void viewChoosedClient() {
		viewicon.click();

	}

	public boolean verifyViewIcon() {
		if (viewedclient.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void updateClient() {
		wu=new WaitUtility(driver);
		wu.waitforVisibilityofElement(updateicon);
		updateicon.sendKeys(Keys.ENTER);
	}
	public void enterNewPostcode(String post_code) {
		postcode.sendKeys(post_code);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", savebutn);

	}
	public boolean verifyUpdatedClientIsDisplayed() {
		wu=new WaitUtility(driver);
		wu.waitforVisibilityofElement(updatedclient);
		if (updatedclient.isDisplayed()) {
			return true;
		}
		return false;
	}

}
