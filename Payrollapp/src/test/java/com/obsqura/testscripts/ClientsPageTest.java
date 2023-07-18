package com.obsqura.testscripts;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsqura.pages.ClientsPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.*;
public class ClientsPageTest extends TestHelper {
	LoginPage lp;
	HomePage hP;
	ClientsPage cp;
	FileReaderUtility fru = new FileReaderUtility();
	WebElement branch,division,invoiceorder, invoicedeliverymethod,masterdocument, vatrate;
	@Test
	public void searchClientDetailsUsingClientName() {
		String username = "carol";
		String password = "1q2w3e4r";
		lp = new LoginPage(driver);
		lp.login(username, password);
		hP = new HomePage(driver);
		hP.clickClient();
		cp = new ClientsPage(driver);
		String clientname = "Haritha";
		cp.searchByClientName(clientname);
		Assert.assertTrue(cp.checkClientNameisDisplayed());
	}
	@Test
	public void searchClientDetailsUsingClientId() {
		String username = "carol";
		String password = "1q2w3e4r";
		lp = new LoginPage(driver);
		lp.login(username, password);
		hP = new HomePage(driver);
		hP.clickClient();
		cp = new ClientsPage(driver);
		String clientid = "6";
		cp.searchByClientId(clientid);
		Assert.assertTrue(cp.checkClientIdisDisplayed());
	}
	@Test
	public void createANewClient() {
		String username = "carol";
		String password = "1q2w3e4r";
		lp = new LoginPage(driver);
		lp.login(username, password);
		hP = new HomePage(driver);
		hP.clickClient();
		cp = new ClientsPage(driver);
		cp.clickCreateClient();
		cp.selectBranchDropDown(branch, "Alpha_new");
		cp.selectDivisionDropDown(division,"NewAlpha");
		cp.enterClientName("Bessy");
		cp.enterClientAddress("64 LeewardLane ,Torquay" );
		cp.enterPostCode("TQ27GB");
		cp.enterInvoiceContact("7734516549");
		cp.enterPhoneNum("9968754396");
		cp.enterEmail("bessy23@gmail.com");
		cp.enterCompanyRegNum("XL4636");
		cp.selectInvoiceOrderDropDown(invoiceorder,"Work location");
		cp.selectInvoiceDeliveryMethodDropDown(invoicedeliverymethod,"Electronic");
		cp.selectMasterDocumentDropDown(masterdocument,"PDF");
		cp.enterSettilementDay("4");
		cp.selectVatRateDropDown(vatrate,"VAT 15.00%");
		cp.clickSaveButton();
		Assert.assertTrue(cp.verifyCreatedClientIsDisplayed());
	}
	@Test
	public void checkViewIcon() {
		String username = "carol";
		String password = "1q2w3e4r";
		lp = new LoginPage(driver);
		lp.login(username, password);
		hP = new HomePage(driver);
		hP.clickClient();
		cp = new ClientsPage(driver);
		cp.viewChoosedClient();
		Assert.assertTrue(cp.verifyViewIcon());
	
   }
	@Test
	public void checkUpdateIcon() {
		String username = "carol";
		String password = "1q2w3e4r";
		lp = new LoginPage(driver);
		lp.login(username, password);
		hP = new HomePage(driver);
		hP.clickClient();
		cp = new ClientsPage(driver);
		cp.updateClient();
		cp.enterNewPostcode("NB9867L");
		Assert.assertTrue(cp.verifyUpdatedClientIsDisplayed());
		
   }
}