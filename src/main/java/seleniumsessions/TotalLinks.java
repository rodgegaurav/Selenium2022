package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	//1. total number of link on the page
	//2. print the text of each link on the console
	//3. print only those link which has text only with index number.
	//4.find out the broken links -- 
	
	static WebDriver driver;
	
	//1.total number of links on the page
	public static int getPageElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	//2.Non blank text link
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	//3. Non blank text count:
	public static int getElementTextCount(By locator) {
		return getElementsTextList(locator).size();
	}
	
	//4. Blank list count:
	
	public static int getEmptyEletextList(By locator) {
		int totalLinks = getPageElementsCount(locator);
		int totalNonEmptyLinks = getElementTextCount(locator);
		return totalLinks - totalNonEmptyLinks;
	}
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
//		List<WebElement> linkList = driver.findElements(By.tagName("a"));
//		System.out.println("total link "+ linkList.size());
//		
//		for(int i=0; i<linkList.size(); i++) {
//			String text = linkList.get(i).getText();
//			if(!text.isEmpty()) {
//				System.out.println(i+":"+text);
//			}
//		}
		
		//
//		int count = 0;
//		for(WebElement e : linkList) {
//			String text = e.getText();
//			if(!text.isEmpty()) {
//				System.out.println(count+":"+text);
//			}
//			count++;
//		}
//		
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		int totalLinks = getPageElementsCount(links);
		System.out.println("Total number of link is : "+totalLinks);
		
		int totalImages = getPageElementsCount(images);
		System.out.println("Total Number of Images : "+totalImages);
		
		List<String> linksTextList = getElementsTextList(links);
		System.out.println(linksTextList);
		System.out.println("non blank list:"+ getElementTextCount(links));
		System.out.println("balnk list: "+ getEmptyEletextList(links));
		

	}
	
	
	

}
