import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestingNG_FB {

	//web driver installation
	WebDriver driver;
	// before opening the browser we must implement the chrome driver in the selenium
	@BeforeTest
	public void openbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	//chrome driver installation
	driver=new ChromeDriver();
	//maximize the browser screen
	driver.manage().window().maximize();
	//remove all the cookies or history from the browser
	driver.manage().deleteAllCookies();
	//implement 30 second loadout time
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//implement 20 second wait time
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//Initiate website
	driver.get("http://facebook.com/");
	
	//Begin test 1 loading the homepage of the website
	}
	@Test(priority=1)
	public void getPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	
	//Begin test 2 enter user email and password of the website
	}

		@Test(priority=2)
		public void Login() {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amzad.hossain2296@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Omega9595$");
			System.out.println("User able to Enter Info");
		//Begin test 3 click on log in button
		}
		@Test(priority=3)
		public void ClickOnLogin() {
			driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
			System.out.println("User able to Login");
		//once all the test is completed the browser will shut down
		}
		@AfterTest
		public void Close() {
			driver.close();
			
		}
	}

