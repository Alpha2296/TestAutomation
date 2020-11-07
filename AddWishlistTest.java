package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.base.TestBase;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.ProductDetails;
import com.ap.qa.pages.SearchPage;

public class AddWishlistTest extends TestBase {

HomePage homePage;
LoginPage loginPage;	
SearchPage searchPage;
ProductDetails productDetails;



public AddWishlistTest() {
	super();
	
}
@BeforeMethod
public void setUp() {
	initialization();
	homePage = new HomePage();
	loginPage = new LoginPage();
	searchPage = new SearchPage();
	productDetails = new ProductDetails();
	
}
@Test
public void TestAddWishList() {
	String product = "Printed Chiffon Dress";
	homePage.ClickOnSignIn();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	searchPage = homePage.searchProduct(product);
	String header = searchPage.getHeader();
	Assert.assertTrue(header.toLowerCase().contains(product.toLowerCase()));
	productDetails = searchPage.selectProduct(product);
	productDetails.clickAddWishListButton();
	productDetails.verifyAddWishListMsg();
	homePage.logOut();
}
@AfterMethod
public void tearDown() {
	driver.quit();


}

}
