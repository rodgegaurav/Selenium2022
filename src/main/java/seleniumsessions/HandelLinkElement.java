package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelLinkElement {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");	
		
		//6.Text Link: only applicable for link.
		//link html tag = <a> with text
		
		driver.findElement(By.linkText("MacBook")).click();
		
		//7.partial link text:
		
		//driver.findElement(By.partialLinkText("Mac")).click();
		driver.findElement(By.partialLinkText("Book")).click();
		
		
		
		
		

	}

}
