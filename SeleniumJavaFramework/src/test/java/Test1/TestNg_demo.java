package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GooglesearchPageObject;
import config.PropertiesFile;

public class TestNg_demo {

	public static String browserName=null;
	//WebDriver driver=null;
	WebDriver driver;
	@BeforeTest
	public void SetUp_test()
	{
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromed/chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver/geckodriver.exe");
			driver =new FirefoxDriver();
		}
	}
	@Test
	public void GooglesearchTest()
	{
		GooglesearchPageObject searchpageobj= new GooglesearchPageObject(driver);
		driver.get("https://google.com");
		//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.5");
		searchpageobj.setTextInSearchBox("valuemomentum.com");
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
