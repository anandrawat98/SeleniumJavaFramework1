package WaitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo
{
	WebDriver driver;
	@Test
	public void seleniumwaits()
	{
		String projectpath=System.getProperty("user.dir");
		/* System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromed\\chromedriver.exe");	
		driver =new ChromeDriver(); */
		System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\edge\\edgedriver_win64\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250 ms is polling for implicit waits
		driver.get("https://vmivsp.sharepoint.com/");

	}
}
