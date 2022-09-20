package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
				
	//1. "search Driver" interface is parent of "web driver"
	//2. "web driver" interface is parent of "remote web driver" class
	//3. "remote web driver class" is parent of "firefox , safari, internet exporer, cromium driver class"
	//4. "cromium driver class " is parent of "edge, crome driver web class".
		
	//WebDriver driver = new WebDriver();// can not create object as WebDriver is an Interface
				
	//start the server with binary or .exe file.
					
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
				
	// Top Casting
				
		WebDriver driver = new ChromeDriver();// we are doing top casting to achieve cross browser
	    //WebDriver driver1 = new FirefoxDriver();
						
	//launch url		
						
		driver.get("https://www.google.com");//"https://" is mandatory to write, but "www." is not mandatory
				
	//get title
		String title = driver.getTitle();
		System.out.println("page title is : "+ title);
		
	//verification point/ checkpoint/assertion/actual vs expected	
		if(title.equals("Google")) {
			System.out.println("correct url");
		}
		else {
			System.out.println("Incorrect url");
		}
		
		//automation steps + verification point (checkpoint) = Automation Testing
	
	//get url methos:
		String url = driver.getCurrentUrl();
		System.out.println(url);		
		
		//String source = driver.getPageSource();
		//System.out.println(source);
		
	//close the browser automatically:
		driver.quit();
		
	//	
		
		
		
		
		
		
		
		
		

	}

}
