package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static WebDriver driver;
	
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static By getBy(String locatorType,String  selector) {
		By locator = null;
		
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(selector);
			break;

		default:
			break;
		}
		return locator;
		
	}
	
	public static void doSendKeys(String locatorType, String  selector, String value) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create the webelement + perform actions click, sendkeys, gettext, is Displayed...
		
		//1. id: 
		
		//1st Approach		
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Pass123");
		
		//2. Approach: 
		//WebElement is an Interface
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("test@gamil.com");
//		password.sendKeys("Pass@123");
		
		//3. Approach: By Locator Approach - called OR (Objet reposatory)
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailEle = driver.findElement(emailId);
//		WebElement passEle = driver.findElement(password);
//		
//		emailEle.sendKeys("naveen@hotmail.com");
//		passEle.sendKeys("Pass@123");
		
		//4. Approach: 
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gamil.com");
//		getElement(password).sendKeys("Pass@123");
		
		//5. Approach : By loacator generic method for element and action
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "naveen@gamil.com");
//		doSendKeys(password, "Pass@123");
		
		//6. By locator: generic methods for element and action in some util class:
		//Better Approach
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		
//		eleUtil.doSendKeys(emailId, "test@gamil.com");
//		eleUtil.doSendKeys(password, "Pass@123");
		
		//7th approach: using utils in a different class
		
		//8th approach: String locator + generic method for element and in some util clas:
		
//		String email_id = "input-email";
//		String password_id = "input-password";
//		
//		By email = By.id(email_id);
//		By password = By.id(password_id);
//		
//		doSendKeys(email, "Naveen@gamil.com");
//		doSendKeys(password, "Pass@123");
		
		//9th
		
//		String email_id = "input-email";
//		String password_id = "input-password";
//						
//		doSendKeys(getBy(email_id), "Naveen@gamil.com");
//		doSendKeys(getBy(password_id), "Pass@123");
	
		//10th
		
		String email_id = "input-email";
		String password_id = "input-password";
		
		doSendKeys("id", email_id, "Naveen@gamil.com");
		doSendKeys("id", password_id, "Pass@123");
		
	}

}
