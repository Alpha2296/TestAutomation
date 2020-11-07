import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	private static Object js;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//getting the URL
		  
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.gap.com/");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 WebElement closed = driver.findElement(By.xpath("/html/body/div/[5]/div/div[2]/div[1]/button"));
		 if(closed.isDisplayed()) {
			 closed.click();
			 
		 }
		 
		 //JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 //scroll by pixel
		 
		 //js.executeScript("window.scrollBy(0, 1000)","");
		 
		 //Visible element
		 //WebElement kindle =driver.findElement(By.xpath("/html/body/main/div[2]/div[4]/div[1]/div[11]/div/div/div/
		 //js.executeScript("arugments[0].scrollIntoView();",kindle);
		 
		//Going to the bottom of the page
		 
		 //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  
		 
	}
}