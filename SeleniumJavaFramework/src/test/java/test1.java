import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test1 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//String projectpath =System.getProperty("user.dir");
		//System.out.println("projectpath :"+projectpath);
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\geckodriver\\geckodriver.exe");
//WebDriver driver =new FirefoxDriver();
//driver.get("google.com");
		
		
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromed/chromedriver.exe");
		//C:\Users\AnandRawat\eclipse-workspace\SeleniumJavaFramework\Drivers\chromed
		//WebDriver n=new ChromeDriver();
		System.setProperty("webdriver.edge.driver","C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\edge\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://prms.valuemomentum.biz/EasyPAY/view/loginmain.aspx");
		//String S=n.getTitle();
		//System.out.println("Tile is "+S);
		Thread.sleep(5000);
		
	}

}
