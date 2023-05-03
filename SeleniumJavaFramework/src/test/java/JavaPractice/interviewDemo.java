package JavaPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class interviewDemo {

	public static WebDriver driver;
	
	
	@Test
	public void frist()
	{

		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\edge\\edgedriver_win64\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("java automation testing");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Actions a=new Actions(driver);
		driver.manage().window().maximize();
	// a.keyDown(Keys.SHIFT);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath("//div[text()=\"Selenium\"]"));
		//js.executeScript("arguments[0].scrollIntoView();", element);
	
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		element.click();
		
		System.out.println(element.getText());
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"dimg_47\"]"));
		
		System.out.println(element1.getAttribute("src"));
		WebElement element2=driver.findElement(By.xpath("//*[@aria-label=\"Automation Testing - javatpoint\"]"));
		
		System.out.println(element2.getAttribute("href"));
		
	List<WebElement>	m=driver.findElements(By.xpath("//*[@jscontroller=\"SsqYNb\"]"));
	
	for(int i=0;i<m.size();i++)
	{
		String s=m.get(i).getText();
		System.out.println("Elements are "+ s);
	}
	driver.close();

	}
	
	

}
