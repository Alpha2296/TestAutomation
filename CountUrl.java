import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//installation for chrome driver
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 //webpage for automation
		driver.get("https://www.walmart.com/");
		


			//element for whole page
			List<WebElement>images=driver.findElements(By.xpath("/html/body/div[1]/div/div/div[3]"));
			System.out.println(images.size());
			for(int i =0; i<images.size();i++) {
				System.out.println(images.get(i).getAttribute("src"));
			}
		}
      
    

}


	
	
