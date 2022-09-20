package seleniumsessions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		//geckodriver.exe --> Mozilla
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
	
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
				
		
	}

}
