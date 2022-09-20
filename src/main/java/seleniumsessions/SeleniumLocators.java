package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	static WebDriver driver;
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.id: unique attribute - 1st preference
		//2.name: can be duplicate
		
//		driver.findElement(By.name("email")).sendKeys("test@gamil.com");
//		driver.findElement(By.name("password")).sendKeys(	);
		
//		By emailId = By.name("email");
//		By emailPassword = By.name("password");
//		
//		String email_name = "email";
//		String email_password = "password";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
//		eleUtil.doSendKeys(emailId, "test@gamil.com");
//		eleUtil.doSendKeys(emailPassword, "password");
		
//		eleUtil.doSendKeys("name", email_name, "test@gamil.com");
//		eleUtil.doSendKeys("name", email_password, "test@123");
		
		//3. class name: can be duplicate for multiple web elements... use only when its unique for single element
		
		//4.xpath: It is not an attribute, its address of the element in HTML DOM
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gamil.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		By emailId = By.xpath("//*[@id=\"input-email\"]");
		By emailPassword = By.xpath("//*[@id=\"input-password\"]");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		String email_name = "//*[@id=\"input-email\"]";
		String email_password = "//*[@id=\"input-password\"]";
		String login_Button = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		
//		eleUtil.doSendKeys(emailId, "test@gamil.com");
//		eleUtil.doSendKeys(emailPassword, "password");
//		eleUtil.doClick(loginBtn);
		//doClick(loginBtn);
		
		
//		eleUtil.doSendKeys("xpath", email_name, "test@gamil.com");
//		eleUtil.doSendKeys("xpath", email_password, "test@123");
//		eleUtil.doClick("xpath", login_Button);
		
		//5. css selector: It is not an attribute
		
		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gamil.com");
		
		
		
		
		
		
		
		
		
		
		
	}

}
