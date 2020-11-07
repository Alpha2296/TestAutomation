import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.setHeadless(true);
		
		 WebDriver driver = new ChromeDriver(options);
		 driver.get("http://www.amazon.com/");
		 System.out.println("Title of the Page:"+driver.getTitle());
	}
}

