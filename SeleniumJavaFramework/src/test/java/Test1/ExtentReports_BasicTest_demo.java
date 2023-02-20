package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports_BasicTest_demo
{
	@BeforeTest
  public void SetUp()
  {
		
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(htmlreporter);
	  System.setProperty("webdriver.chrome.driver","./Drivers/chromed/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
  }
	@Test
	public void Test1()
	{
			
	}
	@AfterTest
	public void Teardown()
	{
		
	}
}
