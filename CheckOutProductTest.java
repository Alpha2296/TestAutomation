package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.datamodel.ProductData;
import com.ap.qa.base.TestBase;
import com.ap.qa.dataprovider.DataProviders;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.OrderSummary;
import com.ap.qa.pages.ProductDetails;
import com.ap.qa.pages.SearchPage;

public class CheckOutProductTest  extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	SearchPage searchPage;
	ProductDetails productDetails;
	OrderSummary orderSummary;
	
	public CheckOutProductTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		
		loginPage = new LoginPage();
		homePage = new HomePage();
		searchPage = new SearchPage();
		productDetails = new ProductDetails();
		orderSummary = new OrderSummary();
		
	}
	@Test(dataProvider= "ProductData", dataProviderClass=DataProviders.class)
	public void testCheckoutProcess(ProductData data) {
		String product = data.getProductName();
		homePage.ClickOnSignIn();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		searchPage = homePage.searchProduct(product);
		String header = searchPage.getHeader();
		System.out.println(header);
		Assert.assertTrue(header.toLowerCase().contains(product.toLowerCase()));
		productDetails = searchPage.selectProduct(product);
		productDetails = inputQuantity(data.getQuantity());
		productDetails = selectProductColor(data.getColor());
		productDetails = selectSize(data.getSize());
		productDetails = clickAddCart();
		orderSummary = productDetails.proceedCheckOut();
		
		orderSummary.proceedCheckOut();
		orderSummary.proceedAddressCheckOut();
		orderSummary.proceedShipping();
		orderSummary.confirmOrder();
		
		String message = orderSummary.getConfirmMessage();
		Assert.assertEquals("Your order on My Store is complete.", message);
		homePage.logOut();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
		
		
	
	
	



	
	private ProductDetails clickAddCart() {
		// TODO Auto-generated method stub
		return null;
	}
	private ProductDetails inputQuantity(String quantity) {
		// TODO Auto-generated method stub
		return null;
	}
	private ProductDetails selectProductColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	private ProductDetails selectSize(String size) {
		// TODO Auto-generated method stub
		return null;
	}

}
