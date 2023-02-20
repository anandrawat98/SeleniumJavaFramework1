package WaitsDemo;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitDemo 
{
	public static void Main(String args[])
	{
		fluentdemo();
	}
	static WebDriver driver;
	public static void fluentdemo()
	{
		String projectpath=System.getProperty("user.dir");
		/* System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromed\\chromedriver.exe");	
	driver =new ChromeDriver(); */
		System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\edge\\edgedriver_win64\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://vmivsp.sharepoint.com/");
		driver.manage().window().maximize();

		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(30, TimeUnit.SECONDS)
		.pollingEvery(2, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver) 
			{
				
				return driver.findElement(By.id("HeaderButtonRegion"));
			}
		});

	}
}
