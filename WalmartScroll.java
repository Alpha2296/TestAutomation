import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//installation of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //open walmart website
		 driver.get("https://www.walmart.com/");
		 //full screen 
		 driver.manage().window().maximize();
		 //installation of java script execution
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		
		//waiting 2 second during the automation 
		 Thread.sleep(2000);
		//scroll by pixel 
		 js.executeScript("window.scrollBy(0, 250)","");
		//waiting 2 second during the automation  
		 Thread.sleep(2000);
		 //location of the capital one ad
		 Boolean Display = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/section[2]/div[1]/div[2]/div[4]/a/span")).isDisplayed();
	     //confirming the element does exist or is displayed
		 System.out.println("Element displayed is :"+Display);
		 //allowing the element to enabled or accessible
		 Boolean Enable = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/section[2]/div[1]/div[2]/div[4]/a/span")).isEnabled();
		 //printing confirmation of element being enabled
		 System.out.println("Element enabled is :"+Enable);
		 //clicking on the element
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/section[2]/div[1]/div[2]/div[4]/a/span")).click();
		 //waiting 2 second during the automation
		 Thread.sleep(2000);
		 //scrolling the screen all the way down
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 
		 }

}
