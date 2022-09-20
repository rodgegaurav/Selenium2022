package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("opera");
		brUtil.launchurl("https://www.amazon.com");
		
		if(brUtil.isurlFractionExist("amazon")) {
			System.out.println("url is correct with amazon .....pass");
		}
		else {
			System.out.println("url is incorrect with amazon .....fail");
		}
		
		if(brUtil.isInfoExistInPageSource("https://completion.amazon.com")) {
			System.out.println("correct is page source");
		}
		else {
			System.out.println("Incorrect is page source");
		}
		
		
		//brUtil
		
		if(brUtil.getPageTitle().contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("correct title.....pass");
		}
		else {
			System.out.println("incorrect title.....fails");
		}
		
		brUtil.closeBrowser();
		
		
		

	}

}
