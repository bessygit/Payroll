package com.obsqura.testscripts;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.obsqura.utilities.FileReaderUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHelper {
	WebDriver driver;

	@BeforeMethod
	@Parameters("chromebrowser")
	public void BrowserLaunching(@Optional("chrome") String browser) {
		FileReaderUtility fru = new FileReaderUtility();
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", fru.chromeDriverPath());
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", fru.edgeDriverPath());
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.get(fru.getApplicationUrl());

	}

	@AfterMethod
	public void screenShot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				String path = System.getProperty("user.dir");
				FileUtils.copyFile(src,new File(path+"\\target"+result.getName()+".png"));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
		driver.close();
	}
}
