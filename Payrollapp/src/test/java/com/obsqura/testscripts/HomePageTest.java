package com.obsqura.testscripts;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.ClientsPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.WorkersPage;
import com.obsqura.utilities.FileReaderUtility;

public class HomePageTest extends TestHelper {
    LoginPage lp;
	HomePage hP;
	ClientsPage cp;
	WorkersPage wp;
	FileReaderUtility fru = new FileReaderUtility();

	@Test
	public void clientPageLoaded() {
		String username = "carol";
		String password = "1q2w3e4r";
		lp = new LoginPage(driver);
		lp.login(username, password);
		hP= new HomePage(driver);
		hP.clickClient();
		cp = new ClientsPage(driver);
		Assert.assertTrue(cp.verifyElementsOnClientsPage());
       }
	@Test
	public void WorkersPageLoaded() {
		String username = "carol";
		String password = "1q2w3e4r";
		lp = new LoginPage(driver);
		lp.login(username, password);
		hP= new HomePage(driver);
		hP.clickClient();
		wp=new WorkersPage(driver);
		Assert.assertTrue(wp.verifyElementsOnWorkersPage());
       }
	 
}