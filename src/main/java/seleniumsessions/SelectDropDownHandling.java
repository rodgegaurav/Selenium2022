package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandling {
	
	static WebDriver driver; // so that we can create the utilities in same class and this same driver can be used in other methods also 
	
	public static void doSelectByIndex(By locator, int index) {
		//for Select class we have to give WebElement as inpute parameter.
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void doSelectByvalue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//DropDown - select tag
		//use Select class from selenium.
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
		By state = By.id("Form_getForm_State");
		
//		Select select = new Select(driver.findElement(country));
//		
//		select.selectByIndex(5);
//		select.selectByVisibleText("India");
//		select.selectByValue("Belarus");
		
		//doSelectByIndex(country, 5);
		//doSelectByVisibleText(country, "India");
		//doSelectByvalue(country, "India");
		//Thread.sleep(3000);
		//doSelectByVisibleText(state, "Goa");
		

	}

}
