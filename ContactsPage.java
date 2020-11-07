package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ap.qa.base.TestBase;

//Extending the baseclass, inheriting characteristic from TestBase
public class ContactsPage extends TestBase {

//Capture all the locator value you are working with.
@FindBy(id="id_contact")
//Interact with any WebElement
//Purose of doing it is to manage multiple  locators
WebElement headingDropdown;

@FindBy(id="email")
WebElement EmailAddress;

@FindBy(id="id_order")
WebElement orderbase;

@FindBy(id="message")
WebElement writemessage;

@FindBy(xpath="//*[@id=\"submitMessage\"]/span")
WebElement sendmessage;

@FindBy(xpath="//*[@id=\"center_column\"]/p")
WebElement sucessmgs;

//Constructor
public ContactsPage() {
//InitElements are the Elements we called above. Like Email, Orderbase
PageFactory.initElements(driver, this);
}

//Paramater is holding the data type. Like the String for heading, email, reference and message
public ContactsPage fillContactForm(String heading, String email, String reference, String message) {
Select select=new Select(headingDropdown);
select.selectByVisibleText(heading);
EmailAddress.sendKeys(email);
orderbase.sendKeys(reference);
writemessage.sendKeys(message);
return this;
}
//Referencing the object
public void submitmessage() {
sendmessage.click();
}

public String getmessage() {
return sucessmgs.getText();
}

}
