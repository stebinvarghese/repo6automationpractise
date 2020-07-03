package com.automation.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pageObjects.LoginPageAutomation;

public class ETestCase003 extends EBaseClass {
	
   
@Test  (priority=1)

public void loginAutofailed1() throws IOException, InterruptedException

{
	driver.get(baseURLE);	
	LoginPageAutomation lpa= new LoginPageAutomation(driver);		
	lpa.getEmailAddress(emailb);
	lpa.getpasswd(passwdb);
	lpa.signinButton();
	Thread.sleep(10000);	
	if (driver.getPageSource().contains("An email address required."))		
	{
		Assert.assertTrue(true);
		System.out.println("Test case passed");	
	}
	
	else
		
	{    Assert.assertTrue(false);		
		System.out.println("Test case faield");		
	}
}


	@Test  (priority=2)
	public void loginAutofailed2() throws IOException, InterruptedException
	
{		driver.get(baseURLE);
		LoginPageAutomation lpa= new LoginPageAutomation(driver);		
		lpa.getEmailAddress(emailb);
		lpa.getpasswd(passwd);
		lpa.signinButton();
		
		Thread.sleep(5000); 
		
		if (driver.getPageSource().contains("An email address required."))		
		{
			Assert.assertTrue(true);
			System.out.println("Test case passed");		
		}
		
		else
			
		{    Assert.assertTrue(false);		
			System.out.println("Test case faield");		
		}
		
}


	@Test  (priority=3)
	public void loginAutofailed3() throws IOException, InterruptedException
	
{
		driver.get(baseURLE);
		LoginPageAutomation lpa= new LoginPageAutomation(driver);		
		lpa.getEmailAddress(email);
		lpa.getpasswd(passwdb);
		lpa.signinButton();
		Thread.sleep(5000);
		
		if (driver.getPageSource().contains("Password is required."))		
		{
			Assert.assertTrue(true);
			System.out.println("Test case passed");		
		}
		
		else
			
		{    Assert.assertTrue(false);		
			System.out.println("Test case faield");		
		}
		
			
	}
		
		
		
	@Test  (priority=4)
	public void loginAutofailed4() throws IOException, InterruptedException
	
{		driver.get(baseURLE);
		LoginPageAutomation lpa= new LoginPageAutomation(driver);		
		lpa.getEmailAddress(emailw);
		lpa.getpasswd(passwdw);
		lpa.signinButton();
		
		Thread.sleep(5000);
		
		if (driver.getPageSource().contains("Authentication failed."))		
		{
			Assert.assertTrue(true);
			System.out.println("Test case passed");		
		}
		
		else
			
		{    Assert.assertTrue(false);		
			System.out.println("Test case faield");		
		}
}
		
		
		
	@Test  (priority=5)
	public void loginSuccess() throws IOException, InterruptedException
	
{		driver.get(baseURLE);
		LoginPageAutomation lpa= new LoginPageAutomation(driver);		
		lpa.getEmailAddress(email);
		lpa.getpasswd(passwd);
		lpa.signinButton();
		Thread.sleep(5000);
		

		if (driver.getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders."))		
		{
			Assert.assertTrue(true);
			System.out.println("Test case passed");		
		}
		
		else
			
		{    Assert.assertTrue(false);		
			System.out.println("Test case faield");		
		}
}
		
		
		
	
	
	
}
