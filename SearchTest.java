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

public class SearchTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	SearchPage searchPage;
	ProductDetails productDetails;
	
	public SearchTest() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		searchPage = new SearchPage();
		productDetails = new ProductDetails();
		
	}
	@Test
	
	public void testSearchItem() {
		String product = "Evening";
		homePage.ClickOnSignIn();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//special, Casual, Evening, Summer
		searchPage = homePage.searchProduct("Evening");
		String header = searchPage.getHeader();
		
		Assert.assertTrue(header.toLowerCase().contains(product.toLowerCase()));
		productDetails = searchPage.selectProduct(product);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
