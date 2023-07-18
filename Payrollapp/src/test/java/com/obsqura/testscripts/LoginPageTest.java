package com.obsqura.testscripts;

import com.obsqura.listeners.reportListners;
import com.obsqura.pages.*;
import com.obsqura.utilities.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(reportListners.class)
public class LoginPageTest extends TestHelper {
	FileReaderUtility fru = new FileReaderUtility();
	WaitUtility wu;

	@DataProvider(name = "ValidCredentials")
	public Object[][] getDataFromDataprovider1() {
		return new Object[][] { { "carol", "1q2w3e4r" } };
	}

	@DataProvider(name = "InvalidCredentials")
	public Object[][] getDataFromDataprovider2() {
		return new Object[][] { { "carol", "pass2" }, { "Bessy", "1q2w3e4r" }, { "nimmy", "pass4" } };
	}

	@Test(dataProvider = "InvalidCredentials")
	public void unsuccessfulLogin(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		Assert.assertTrue(lp.verifyUnSuccessfullLogin());

	}

	@Test(dataProvider = "ValidCredentials")
	public void successfullLogin(String username, String password) {
		LoginPage lP = new LoginPage(driver);
		lP.login(username, password);
	}

	@Test
	public void homePageLoaded() {
		String username = "carol";
		String password = "1q2w3e4r";
		LoginPage lP = new LoginPage(driver);
		lP.login(username, password);
		HomePage hp=new HomePage(driver);
		hp.verifyElementsOnHomePage();
		Assert.assertTrue(hp.verifyElementsOnHomePage());

	}

}
