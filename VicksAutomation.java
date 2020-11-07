import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VicksAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//chrome driver installation 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//window fullscreen 		 
		driver.manage().window().maximize();
		//webpage for automation 
		driver.get("https://vicks.com/en-us");
		//2 second wait 
		Thread.sleep(1000);
		//click on product tab
		driver.findElement(By.xpath("//*[@id=\"menuSlotMobileWrapper\"]/button[1]")).click();
		//java script executor installation
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//scroll down three quarter of a page
		js.executeScript("window.scrollBy(0, 1000)","");
		//clicking on vaporub product 
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[3]/div[1]/div[1]/div[2]/div[1]/a[70]/div/h4")).click();
		//scrolling midpoint of the page
		js.executeScript("window.scrollBy(0, 500)","");
		//clicking on ingredients of the product
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[1]/div/div[2]/div[4]/div[2]/div/div[1]/div[1]")).click();
		//scrolling down more
		js.executeScript("window.scrollBy(0, 800)","");
		//clicking on buy the product
		driver.findElement(By.xpath("//*[@id=\"buynow-container\"]/div/span")).click();
		
		
	
	}

}

