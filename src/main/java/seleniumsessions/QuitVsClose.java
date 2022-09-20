package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//session ID(Ex - 123) is created. browser is open
		
		driver.get("https://naveenautomationlabs.com/opencart/");//enter url
		
		String title = driver.getTitle();//session ID(Ex - 123)
		System.out.println("page title is : "+title);//session ID(Ex - 123)
		
		
		String url = driver.getCurrentUrl();//session ID(Ex - 123)
		System.out.println(url);//session ID(Ex - 123)
		
		//driver.quit();//Browser is close, session ID(Ex - 123) ---> Null
		driver.close();//Browser is close, session ID(Ex - 123) ---> Invalid session ID
		
		//System.out.println(driver.getTitle());//session ID is null in case of quit. and Invalid session ID in case of close
		
		driver = new ChromeDriver();//open browser, new session ID(Ex - 456)
		driver.get("https://naveenautomationlabs.com/opencart/");//new session ID(Ex - 456)
		System.out.println(driver.getTitle());//new session ID(Ex - 456)
		
		
		
	}

}
