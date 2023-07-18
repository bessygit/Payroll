package com.obsqura.utilities;
import java.util.List;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
public boolean isWebElementPresent(WebElement we) {
	if(we.isDisplayed()) {
		return true;
	}
	return false;
}
public void selectDropDown(WebElement ele, String value) {
	Select drp = new Select(ele);
	drp.selectByVisibleText(value);
}

/*
 * public void selectOptionFromDropDown(WebElement ele, String value) { Select
 * drp = new Select(ele); List<WebElement> alloptions = drp.getOptions(); for
 * (WebElement option : alloptions) { if (option.getText().equals("value")) {
 * option.click(); break; } } }
 */


}








