package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



	public class  SignupPage 
	
	{
	public WebDriver driver;
	public  SignupPage(WebDriver driver)
		
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}	
		
	
	
	@FindBy(name="email_create")
	@CacheLookup
	WebElement txtEmailName;

	public void setUserName(String ename)
	{
	txtEmailName.sendKeys(ename);
	}

	@FindBy(xpath="//form[@id='create-account_form']//span[1]")
	WebElement CreateButtonSignupForm;

	public void clickCreateButtonSignupForm()
	{
		CreateButtonSignupForm.click();
	}

	
	
	
	
	
	
}
