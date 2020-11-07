import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		 
		String textverify=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(textverify);
		
	
		
	}

}
