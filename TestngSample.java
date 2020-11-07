import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSample {


//pre-condition
	@BeforeTest
	public void openbrowser() {
		System.out.println("browser opened");

	}
	//Step annotation
	@Test(priority=1)
	public void Registration() {
		System.out.println("User is able to register");
	
	}
	//Step annotation	
     @Test(priority=2)
		public void Login() {
			System.out.println("User is able to register");
		}
     @Test(priority=3)
     public void RegisterAddress() {
    	 System.out.println("User is able to register Address");
    	 }

     @Test(priority=5)
     public void ProfileCreation() {
    	 System.out.println("User is able to create profile");
     }
     
     
     @Test(priority=4)
     public void signoff() {
    	 System.out.println("User is able to sign out");
     }
     //post condition
     @AfterTest
     public void closebrowser() {
    	 System.out.println("Closing browser");
     }


}




