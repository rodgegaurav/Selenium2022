package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectWithSelectClassOnly {
	
	static WebDriver driver;
	
	public static void doSelectValueUsingOptions(By locator, String value) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionList = select.getOptions();
		for(WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)){
				e.click();
				break;
			}
		}
	}
	
	public static void doSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionList = driver.findElements(locator);
		for(WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)){
				e.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
		By countryOption = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		//doSelectValueUsingOptions(country, "India");
		doSelectValueFromDropDown(countryOption, "India");
		
		
		
		
		
		

	}

}
