package Pages;

import org.apache.cassandra.cli.CliParser.keyspace_return;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglesearchPageObject 
{
	static WebDriver driver=null;
	By textbox_search=By.name("q");
	By button_search=By.name("btnK");
	
	public GooglesearchPageObject(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	public void setTextInSearchBox(String text)
	{
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void Clicksearchbutton()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
