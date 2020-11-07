import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EbayAssert {
	
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	
	@BeforeTest
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.ebay.com/");
	
	}
	@Test(priority=1)
	public void verifyTitle() {
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-shop-a\"]")).getText();
		
        String expectedtext = "Shop by Category";
		
    	sa.assertEquals(actualtext,expectedtext);
    	
    	sa.assertAll();
	
	
		
		

}
}