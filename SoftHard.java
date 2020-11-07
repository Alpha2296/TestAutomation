import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHard {

SoftAssert soft = new SoftAssert();
@Test
public void TestCase1() {
	System.out.println("Launch Site");//
	
	System.out.println("Verify title of the page");
	
	soft.assertEquals(true, false);
	
	System.out.println("Entering Email");//
	
	System.out.println("Entering Password");//
	
	System.out.println("Click on the Sign Button");//
	
	soft.assertAll();
	
	
	}

	}


