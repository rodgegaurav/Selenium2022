package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
	
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		eleUtil.doSendKeys(emailId, "naveen@gamil.com");
		eleUtil.doSendKeys(password, "Pass@123");
		
		//brUtil.closeBrowser();
		
		
		
		
		

	}

}
