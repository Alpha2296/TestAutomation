import java.sql.Time;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingNG_Browser {
//web driver installation
WebDriver driver;
	// before opening the browser we must implement the chrome driver in the selenium
	@BeforeTest
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		//chrome driver installation
		driver = new ChromeDriver();
		//maximize the browser screen
		driver.manage().window().maximize();
		//remove all the cookies or history in the browser
		driver.manage().deleteAllCookies();
		//implementing 30 second loadout time
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//implement 20 second wait time 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Initiate website
		driver.get("https://www.amazon.com/");
		
//Begin test 1 loading the homepage of the website
	}
	@Test(priority=1)
	public void getPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
//Begin test 2 clicking on the sign in button
	}
		@Test(priority=2)
		public void Signin() {
			driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
			System.out.println("User was able to click sign in button");
//Begin test 3 signing in the user email and clicking on the continue button		
		}
		@Test(priority=3)
		public void Login() {
			driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("amzad.hossain2296@gmail.com");
			driver.findElement(By.xpath("//*[@id='continue']")).click();
			System.out.println("User was able to login to the email");
//Begin Test 4 signing in the user password	and clicking on the submit button		
		}
		@Test(priority=4)
		public void Login2() {
			driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Omega9595$");
			driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
			System.out.println("User was able to login to the password ");
//Once all the test is completed shutdown the browser after completion		
		}
		@AfterTest
		public void Close() {
			driver.close();
			
		}
	}
			
			
	