package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/dropable/default.html");
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("dropable"));
		
		Actions act = new Actions(driver);
		//In Actions class we have give input parameter as WebDiver
//		act.clickAndHold(sourceEle)//1 Action
//				.moveToElement(targetEle)//2 Action
//					.release()//3 Action
//						.build().perform();//At the end, for multiple actions, it is mandatory to write ".build().perform()"
		
		act.dragAndDrop(sourceEle, targetEle).build().perform();
		
		
		
		
		

	}

}
