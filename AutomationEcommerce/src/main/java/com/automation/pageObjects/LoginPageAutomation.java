package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAutomation {
	
	public WebDriver driver;

	
public  LoginPageAutomation(WebDriver driver)

{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	
}


@FindBy (id="email")
WebElement emailAddressTetxbox;



public void getEmailAddress(String email)

{
	emailAddressTetxbox.sendKeys(email);
}




@FindBy (id="passwd")
WebElement passwdTetxbox;



public void getpasswd(String passwd)

{
	passwdTetxbox.sendKeys(passwd);
}



@FindBy (xpath="//p[@class='submit']//span[1]")
WebElement signinButton;



public void signinButton()

{
	signinButton.click();
}









}
