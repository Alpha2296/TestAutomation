import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class DataRetrieve2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//installation of chrome driver 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//fullscreen webpage		 
		driver.manage().window().maximize();
		//waiting 2 second
		Thread.sleep(1000);
		//webpage for the automation 
		driver.get("https://www.timeanddate.com/worldclock/?continent=europe");
		//element of the table 
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
        //element of the rows
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		//obtain the rows
		for(int i=1;i<rows.size();i++) {
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
		//obtain the columns
		for(int j=1;j<columns.size();j++) {
				System.out.println(columns.get(j).getText()+"  ");
			}
			//System.out.println();
		}
			}
		}


