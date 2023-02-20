package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GooglesearchPageObject;

public class TestNg_demo2 {
	
WebDriver driver=null;

@BeforeTest
public void SetUp_test()
{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromed/chromedriver.exe");
	 driver =new ChromeDriver();
	
}
@Test
	public void GooglesearchTest2()
	{
		GooglesearchPageObject searchpageobj= new GooglesearchPageObject(driver);
		driver.get("https://google.com");
		//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.5");
		searchpageobj.setTextInSearchBox("Java.com");
		//searchpageobj.Clicksearchbutton();

	}
	
@AfterTest
	public void teardown_test()
	{
		driver.close();
		driver.quit();
		System.out.println("PASS :)");
	}
}
