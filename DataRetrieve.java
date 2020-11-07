import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;



public class DataRetrieve {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//chrome driver installation 
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
//fullscreen webpage		 
driver.manage().window().maximize();
//waiting 1 second
Thread.sleep(1000);
//webpage for the automation
driver.get("https://www.timeanddate.com/worldclock/?continent=namerica");

// element of the  whole table
WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
// element of the rows of the  table
List<WebElement>rows=table.findElements(By.tagName("tr"));
//rows are to be obtain 
for(int i=1;i<rows.size();i++) {
	List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
//columns are to be obtain 
for(int j=1;j<columns.size();j++) {
		System.out.println(columns.get(j).getText()+"  ");
	}
	//System.out.println();
}
	}
}

		