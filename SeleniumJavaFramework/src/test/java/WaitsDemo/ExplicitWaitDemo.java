package WaitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo
{
	WebDriver driver;
	@Test
	public void explicitdemo()
	{
		String projectpath=System.getProperty("user.dir");
		/* System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromed\\chromedriver.exe");	
		driver =new ChromeDriver(); */
		System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\edge\\edgedriver_win64\\msedgedriver.exe");
		driver =new EdgeDriver();
	WebDriverWait wait= new WebDriverWait(driver,20);
	
		driver.get("https://vmivsp.sharepoint.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		driver.switchTo().frame("grid-layout");
		action.sendKeys(Keys.DOWN).build().perform();
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"c753a92e-ef9f-4dfd-81c6-711056fb202d\"]/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[3]/div/div/div/a/div/div[2]")));
		//driver.findElement(By.xpath("//*[@id=\"c753a92e-ef9f-4dfd-81c6-711056fb202d\"]/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[3]/div/div/div/a/div/div[2]")).click();
		//driver.quit();
	
	}
}
