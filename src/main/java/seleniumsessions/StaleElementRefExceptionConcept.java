package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept {
	
	static WebDriver driver;	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("tom@gamil.com");
		
		driver.navigate().refresh();
		
		email = driver.findElement(By.id("input-email"));
		
		email.sendKeys("naveen@gamil.com");
		//StaleElementReferenceException
			

	}

}
