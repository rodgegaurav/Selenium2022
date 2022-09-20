package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class PageElement {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static int getElementCount(By locator) {
		int eleCount = getElements(locator).size();
		return eleCount;
	}
	
	public static boolean checkSingleElementExist(By locator) {
		if(getElementCount(locator) == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean checkMultipleElementExist(By locator) {
		if(getElementCount(locator) > 1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.name("search11")).sendKeys("mackbook");
		//for wrong locator - findElement give "NoSuchElementException".
		
		//List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		//System.out.println(langLinks.size());
		//0	
		//for wrong locator - findElements give "Empty list with zero size. i.e. 0".
		
//		List<WebElement> searchList = driver.findElements(By.name("search"));
//		if(searchList.size() == 1) {
//			System.out.println("search is present on page");
//		}
//		
//		boolean flag = driver.findElement(By.name("search")).isDisplayed();
//		System.out.println(flag);
//		if(flag) {
//			System.out.println("search is present on page");
//		}
		
//		By search =  By.name("search");
//		
//		
//		if(checkSingleElementExist(search)) {
//			System.out.println("search exist only one time on page");
//		}
//		
//		By forgotpwd = By.linkText("Forgotten Password");
//		//doIsDisplayed(forgotpwd);
//		if(checkMultipleElementExist(forgotpwd)) {
//			System.out.println("forgot pwd is having multiple displayed");
//			if(getElementCount(forgotpwd) == 2) {
//				System.out.println("forgot pwd link is coming 2 times on the page");
//			}
//		}
		
		//driver.findElement(By.xpath("//input@[@@@@@id)='input-email']"));
		//InvalidSelectorException
		
		
		
		
		
		
		
		
		
	}

}
