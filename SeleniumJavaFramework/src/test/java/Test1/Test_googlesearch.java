package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_googlesearch {
public static void main(String[] args)
{
	Googlesearch();
}
public static void Googlesearch()
{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromed/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://google.com");
	//driver.findElement(By.xpath("//*[contains(text(),'No thanks')][1])")).click();
	driver.findElement(By.name("q")).sendKeys("Valuemomentum.com");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN); //To enter "ENTER" key in keyword we use "Keys.RETURN"
	System.out.println("PASS");
	//driver.getTitle();
	driver.close();
}
}
