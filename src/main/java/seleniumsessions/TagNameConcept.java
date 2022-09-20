package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {
	
	static WebDriver driver;

	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println(eleText);
		return eleText;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=43");
		
		
		//8. Tag Name:
		
		//String prName = driver.findElement(By.tagName("h1")).getText();
		//System.out.println(prName);
		
		By productHeader = By.tagName("h1");
		String actPrName = doElementGetText(productHeader);
		if(actPrName.equals("MacBook")) {
			System.out.println("product name is correct....pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		
		
		
		
	}

}
