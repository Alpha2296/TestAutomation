package com.ap.qa.pages;

import com.ap.qa.base.TestBase;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductDetails extends TestBase {
	
	@FindBy(id="quantity_wanted")
	WebElement quantityInput;

	@FindBy(css="[id='group_1']")
	WebElement sizeDropDown;
	
	@FindBy(css="[id='add_to_cart']")
	WebElement addCartButton;
	
	@FindBy(css="[title='Proceed to checkout']")
	WebElement proceedCheckOut;
	
	@FindBy(css="[title='Add to my wishlist']")
	WebElement addToWishListButton;
	
	@FindBy(css="[class='fancybox-error']")
	WebElement addWishListMsg;
	
	@FindBy(css="[class='fancybox-item fancybox-close']")
	WebElement addWishListMsgCloseButton;
	
	public ProductDetails(){
		PageFactory.initElements(driver, this);

	}
	public void verifyAddWishListMsg() {
		Assert.assertEquals(addWishListMsg.getText(), "Added to your wishlist.");
		addWishListMsgCloseButton.click();
	}
	public ProductDetails selectProductColor(String color) {
		String locator ="[name='"+color+"']";
				driver .findElement(By.cssSelector(locator)).click();
				return this;
	}
	public ProductDetails inputQuantity(String quantity) {
		quantityInput.clear();
		quantityInput.sendKeys(quantity);
		return this;
	}
	public ProductDetails selectSize(String size) {
	Select select = new Select(sizeDropDown);
	select.selectByVisibleText(size);
	return this;
	
	}
	public ProductDetails clickAddCart() {
		addCartButton.click();
		return this;
	}
	public ProductDetails clickAddWishListButton() {
		addToWishListButton.click();
		return this;
	}
	public OrderSummary proceedCheckOut() {
		proceedCheckOut.click();
		return new OrderSummary();
		
	}
	

}
