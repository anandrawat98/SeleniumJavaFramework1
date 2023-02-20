package TestNGPriority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestInMutipleBrowser {
	WebDriver driver=null;

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)
	{
		System.out.println("Browser name is "+browserName);
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromed/chromedriver.exe");
			driver =new ChromeDriver();
			}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\edge\\edgedriver_win64\\msedgedriver.exe");
			driver =new EdgeDriver();
		}

	}

	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.get("https://prms.valuemomentum.biz/EasyPAY/view/loginmain.aspx");
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
