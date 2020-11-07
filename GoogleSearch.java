import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {

		WebDriver driver;
		
		@BeforeTest
		public void openbrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\OneDrive\\Desktop\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://google.com/");
			

	}
		
		@Test(priority=1)
		public void getPageTitle() {
			String title = driver.getTitle();
			System.out.println(title);
			}
		
		@Test(priority=2)
		public void Search() {
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Moto x Pure Edition");
			System.out.println("User able to Enter Info");
		}
		
		@Test(priority=3)
		public void ClickOnSearch() {
			driver.findElement(By.xpath("//*[@class='gNO89b']")).click();
			System.out.println("User able to Search");
		}
		@AfterTest
		public void Close() {
		driver.close();
	
}
}