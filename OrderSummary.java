package com.ap.qa.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import com.ap.qa.base.TestBase;


public class OrderSummary extends TestBase {

@FindBy(css= "[class='btn btn-default button button-medium'][title='Proceed to checkout']")
WebElement proceedCheckOutButton;

@FindBy(css= "[name='processAddress']")
WebElement processAddressButton;

@FindBy(css= "[id='cgv']")
WebElement termsAndConditionCheckBox;

@FindBy(css= "[name='processCarrier']")
WebElement processCarrierButton;

@FindBy(css= "[class='bankwire'][title='Pay by bank wire']")
WebElement payByBankWire;

@FindBy(css= "[class='button btn btn-default button-medium'][type='submit']")
WebElement confirmOrder;

@FindBy(xpath= "//strong[text()='Your order on My Store is complete.']")
WebElement orderConfirm;

public OrderSummary() {
	PageFactory.initElements(driver, this);
	
}
public OrderSummary proceedCheckOut() {
	proceedCheckOutButton.click();
	return this;
	
}
public OrderSummary proceedAddressCheckOut() {
	processAddressButton.click();
	return this;
	
}
public OrderSummary proceedShipping() {
	termsAndConditionCheckBox.click();
	processCarrierButton.click();
	return this;
	
}
public OrderSummary confirmOrder() {
	payByBankWire.click();
	confirmOrder.click();
	return this;
	
}
public String getConfirmMessage() {
	return orderConfirm.getText();
	

	

	}

}
