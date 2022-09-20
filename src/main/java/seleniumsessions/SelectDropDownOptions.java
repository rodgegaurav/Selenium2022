package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownOptions {
	
	static WebDriver driver;	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropDownValueList(By locator) {
		Select select = new Select(getElement(locator));
		List<String> optionsValueList = new ArrayList<String>();
		List<WebElement> optionsEleList = select.getOptions();
		for(WebElement e : optionsEleList) {
			String text = e.getText();
			optionsValueList.add(text);
			}
		return optionsValueList;
	}

	public static void main(String[] args) {
		
		//DropDown - select tag
				//use Select class from selenium.
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
				
				By country = By.id("Form_getForm_Country");
				By state = By.id("Form_getForm_State");
				
				Select select = new Select(driver.findElement(country));
				
//				
//				List<WebElement> countryList = select.getOptions();
//				System.out.println("total no. of country "+ countryList.size());
//				
//				for(WebElement e:countryList) {
//					String text = e.getText();
//					System.out.println(text);
//				}
						
//				if(getDropDownCount(country)-1 == 231) {
//					System.out.println("Pass");
//				}
				
				System.out.println(getDropDownValueList(country).contains("India"));

	}

}
