package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GooglesearchPageObject;

public class GooglesearchpageobjectTest {
	

	public static void main(String[] args) 
	{
		GooglesearchTest();
	}
	
	public static void GooglesearchTest()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromed/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		GooglesearchPageObject searchpageobj= new GooglesearchPageObject(driver);
		driver.get("https://google.com");
		//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.5");
		searchpageobj.setTextInSearchBox("valuemomentum.com");
		searchpageobj.Clicksearchbutton();
		
		driver.close();
		System.out.println("PASS :)");
	}
}
