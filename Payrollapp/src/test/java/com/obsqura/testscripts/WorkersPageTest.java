package com.obsqura.testscripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.WorkersPage;
import com.obsqura.utilities.FileReaderUtility;

public class WorkersPageTest extends TestHelper{
	LoginPage lp;
	HomePage hP;
	WorkersPage wp;
	WebElement title;
	FileReaderUtility fru = new FileReaderUtility();
	@Test
	public void checkDeleteIcon() {
		String username = "carol";
		String password = "1q2w3e4r";
		lp = new LoginPage(driver);
		lp.login(username, password);
		hP = new HomePage(driver);
		hP.clickWorkers();
		wp = new WorkersPage(driver);
		wp.deleteChoosedClient();
		Assert.assertTrue(wp.verifyDeleteClient());
	
   }
	
}