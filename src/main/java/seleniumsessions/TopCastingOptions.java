package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		
		//1. cross browser - Recommended --> local execution
		
//		WebDriver driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver = new SafariDriver();
//		
//		//2. chrome specific - not recommended for cross browsing
//		ChromeDriver d1 = new ChromeDriver();
		
		//3.RWD - CD - Recommended --> local execution
//		RemoteWebDriver driver3 = new ChromeDriver();
//		driver3.get("https://www.google.com");
//		
//		//4.WD - RWD - Recommended for remote execution
//		//remote execution: grid, cloud, aws, docker grid
//		WebDriver driver4 = new RemoteWebDriver(remoteAddress, capabilities);
		
		//5. SC - CD - valid top casting but not recommended because we are only acsses two method. i.e. findelement and findelements.
//		SearchContext driver5 = new ChromeDriver();
		
		
		
		
		
		

	}

}
