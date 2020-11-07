package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.base.TestBase;
import com.ap.qa.pages.ContactsPage;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.ProductDetails;
import com.ap.qa.pages.SearchPage;

public class HomeTest extends TestBase{

HomePage homePage;
LoginPage loginPage;
SearchPage searchPage;
ProductDetails productDetails;
ContactsPage contactsPage;

public HomeTest() {
	super();
	
}
@BeforeMethod
public void setUp() {
	initialization();
	homePage = new HomePage();
	loginPage = new LoginPage();
	searchPage = new SearchPage();
	productDetails=new ProductDetails();
	contactsPage = new ContactsPage();
	
}
@Test
public void homePageTest() {
	String productName = "Printed Chiffon Dress";
	homePage.ClickOnSignIn();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	contactsPage = contactsPage.fillContactForm("Customer Service", "amzad.hossain2296@gmail.com", "Omega9595$", "This is test purpose");
	
	searchPage = homePage.searchProduct(productName);
	searchPage.selectProduct(productName);
	String header = searchPage.getHeader();
	Assert.assertTrue(header.toLowerCase().contains(productName.toLowerCase()));
	productDetails= searchPage.selectProduct(productName);
	homePage.logOut();
	
}
@AfterMethod
public void tearDown() {
	driver.quit();
}

}

	
	

