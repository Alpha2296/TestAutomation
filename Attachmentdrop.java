import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attachmentdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\OneDrive\\Desktop\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://automationpractice.com/index.php?controller=contact");
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@id='fileUpload']")).sendKeys("C:\\Users\\Omega\\OneDrive\\Desktop\\AutomationTesting.txt");


	}

}
