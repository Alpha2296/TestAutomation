import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {


		
public static WebDriver StartApplication(String browserName, String appURL)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.getProperty("webDriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	
		   driver=new ChromeDriver();
		   
		}
	
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.getProperty("webDriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
			
		{
		    System.getProperty("webDriver.IE.driver",System.getProperty("user.dir")+"/drivers/IE.exe");
			driver=new InternetExplorerDriver();
		
		}	
		
		else if(browserName.equalsIgnoreCase("Edge"))
			
		{
			System.getProperty("webDriver.edge.driver",System.getProperty("user.dir")+"/driver/edge.exe");
			driver=new EdgeDriver();
		}
		
		
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.get(appURL);
	        driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
	        return driver;
	}

}
