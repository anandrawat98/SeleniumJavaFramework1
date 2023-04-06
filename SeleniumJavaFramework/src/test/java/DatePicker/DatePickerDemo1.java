package DatePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import antlr.collections.List;

public class DatePickerDemo1 {

	static WebDriver driver;
	public static void main(String[]args)
	{
		Date();
	}
	
	public static void Date()
	{
		String month ="May";
		String date ="25";
		String year="2024";
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\edge\\edgedriver_win64\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		while(true)
		{
		String text1=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		String text2=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
		
		if(text1.equals(month) && text2.equals(year))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		}
		}
		
		java.util.List <WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		

		for(WebElement ele:alldates)
		{
			String dt=ele.getText();
			if(dt.equals(date))
			{
				ele.click();
				break;
		}
			//System.out.println("ele"+ele);
			//System.out.println("dt"+dt);
		}
		//System.out.println("alldates"+alldates);
		
	}
}
