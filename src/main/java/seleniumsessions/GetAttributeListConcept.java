package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeListConcept {
	
	static WebDriver driver;
	
	public static List<String> getEleAttributeList(By locator, String attName) {
		List<WebElement> eleList = driver.findElements(locator);
		List<String> eleAttrValueList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String attValue = e.getAttribute(attName);
			eleAttrValueList.add(attValue);
		}
		return eleAttrValueList;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//total links on the page and return the href list:
		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		
//		for(WebElement e : linksList) {
//			String hrefValue = e.getAttribute("href");
//			System.out.println(hrefValue);
//		}
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		System.out.println(getEleAttributeList(links, "href"));
		System.out.println(getEleAttributeList(images, "alt"));
		System.out.println(getEleAttributeList(images, "height"));
		
		

	}

}
