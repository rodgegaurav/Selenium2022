package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = WebDriverManager.chromedriver().create();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println("page title is : "+title);
		
		
		
	}

}
