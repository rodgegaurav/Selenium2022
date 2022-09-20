package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This method is used to initialize the driver on the basis of browser name
 * @param browserName
 * @return this returns driver
 */

public class BrowserUtil {
	
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is "+browserName);
		
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		
	else if(browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	else if(browserName.equalsIgnoreCase("safari")) {
		//WebDriverManager.chromedriver().setup();
		driver = new SafariDriver();
	}
	
	else if(browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else {
		System.out.println("Please pass the right browser........."+browserName);
	}
		
	return driver;	
		
	}
	
	public void launchUrl(String url) {
		if(url == null) {
			System.out.println("url is null");
			return;
		}
		driver.get(url);
	}
	
	
	//Launch url
	
	public void launchurl(String url) {
		if(url == null) {
			System.out.println("url is null.....");
			return;
		}
		if(url.indexOf("https") == -1) {
			System.out.println("url is not having https");
			return;
		}
		if(url.indexOf("http") == -1) {
			System.out.println("url is not having http....");
			return;
		}
		if(url.length() == 0) {
			System.out.println("url is blank.....");
		}
		driver.get(url);
	}
	
	//Get Page Title
	
		public String getPageTitle() {
			String title = driver.getTitle();
			System.out.println("page title is "+title);
			return title;
		}
		
	//Get Page url
		
		public String getPageUrl() {
			String url = driver.getCurrentUrl();
			System.out.println("page url is: "+ url);
			return url;
		}
	
	//Getting url Fraction
		
		public boolean isurlFractionExist(String urlFraction) {
			if(getPageUrl().contains(urlFraction)) {
				return true;
			}
			return false;
		}
		
	//Get Page Source
		
		public String getPageSource() {
			String pageSource = driver.getPageSource();
			//System.out.println("page source is: "+ pageSource);
			return pageSource;
		}
		
	//getting info
		
		public boolean isInfoExistInPageSource(String info) {
			if(getPageSource().contains(info)) {
				return true;
			}
			return false;
	}
		
	//Close Browser
		
		public void closeBrowser() {
			driver.close();
		}
		
	//Quit the browser
		
		public void quitBrowser() {
			driver.quit();
		}
		
		
}
