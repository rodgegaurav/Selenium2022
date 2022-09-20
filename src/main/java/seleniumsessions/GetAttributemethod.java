package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributemethod {
	
	static WebDriver driver;
	
	public static String doGetAttribute(By locator, String attName) {
		return getElement(locator).getAttribute(attName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String palceholdervalue = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(palceholdervalue);
//		
//		String loginurlvalue = driver.findElement(By.linkText("Login")).getAttribute("href");
//		System.out.println(loginurlvalue);
		
		By fn = By.id("input-firstname");
		By login = By.linkText("Login");
		
		String palceholdervalue = doGetAttribute(fn, "placeholder");
		String loginurlvalue = doGetAttribute(login, "href");
		
		System.out.println(palceholdervalue);
		System.out.println(loginurlvalue);
		
	}

}
