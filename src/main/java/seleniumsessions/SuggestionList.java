package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionList {
	
	static WebDriver driver;
	
	public static void selectItem(String productName) {
		//li[text()='T-shirts > Faded Short Sleeve T-shirts']
		driver.findElement(By.xpath("//li[text()='"+productName+"']")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(3000);
		selectItem("T-shirts > Faded Short Sleeve T-shirts");
		//driver.findElement(By.xpath("//li[text()='T-shirts > Faded Short Sleeve T-shirts']")).click();
	}

}
