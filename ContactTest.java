package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ap.qa.base.TestBase;
import com.ap.qa.pages.ContactsPage;
import com.ap.qa.pages.HomePage;

public class ContactTest extends TestBase{
	
	
	ContactsPage contactsPage;
	HomePage homePage;
	
	public ContactTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		contactsPage = new ContactsPage();
		homePage = new HomePage();
		
	}
	@Test
	public void testContact() {
		homePage.ClickOnContactLink();
		contactsPage = contactsPage.fillContactForm("Customer Service", "amzad.hossain2296@gmail.com", "Omega9595$", "This is test purpose");
		
		contactsPage.submitmessage();
		String successMsg = contactsPage.getmessage();
		Assert.assertEquals(successMsg, "Your message has been successful sent to our team");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
			
	}

}
