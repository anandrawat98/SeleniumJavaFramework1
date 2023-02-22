package WebElementsDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class WebElementsforOne {

	public static void main(String[] args) {
		OneElementChoice();

	}
	static WebDriver driver;
	public static void OneElementChoice()
	{
		String projectpath=System.getProperty("user.dir");
		/* System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromed\\chromedriver.exe");	
		driver =new ChromeDriver(); */
		System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\edge\\edgedriver_win64\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250 ms is polling for implicit waits
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}

}
