package com.obsqura.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.obsqura.utilities.*;
public class UtilityChecking {
	WebDriver driver;
	
	@Test
	public void dateUtilityChecking() {
		DateUtility du=new DateUtility();
		String date1=du.currentDate();
		System.out.println("Current date:"+ date1);
		date1=du.singleFormatDate();
		System.out.println("Current date in single format :"+date1);
		date1=du.currentDateTime();
		System.out.println("Current Time and Date:"+date1);
		}
	@Test
	public void fileReaderTest() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		FileReaderUtility fru=new  FileReaderUtility();
		driver.get(fru.getApplicationUrl());
		// String s=fru.getApplicationUrl();
		//System.out.println(s);
		
	}
	/*
	 * @Test public void pageutilityTest(){
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe"); driver=new
	 * ChromeDriver(); PageUtility pu=new PageUtility(driver); String
	 * url=pu.getPageUrl();
	 * 
	 * System.out.println("Current Url:"+url);
	 * 
	 * String title=pu.getPageTitle();
	 * 
	 * System.out.println("Page Title:"+title);
	 * 
	 * }
	 */
	

}


