package listeners;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.GooglesearchPageObject;

//@Listeners(listeners.lisnersTest.class) // First Listeners is testng annotation and (listeners is package name .lisnersTest is listners defind class)
public class TestNGListnersDemo
{
@Test
	public void Test1()
	{
		System.out.println("This is test 1");
	}
@Test
	public void Test2()
	{
		System.out.println("This is test 2");
		//Assert.assertTrue(false);
		System.setProperty("webdriver.chrome.driver","./Drivers/chromed/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		GooglesearchPageObject searchpageobj= new GooglesearchPageObject(driver);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.5");
		searchpageobj.setTextInSearchBox("valuemomentum.com");
		searchpageobj.Clicksearchbutton();
		driver.close();
	}
@Test
	public void Test3()
	{
		System.out.println("This is test 3");
		//throw new SkipException("This test3 skipped");
	}
}
