package com.automation.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pageObjects.SignupPage;
import com.automation.pageObjects.UserRegistrationPage;

public class ETestCase001 extends EBaseClass{


	@Test
	public void userRegistrationTest() throws InterruptedException, IOException 
	
	{
		driver.get(baseURLE);
		SignupPage sign2= new SignupPage(driver);
		sign2.setUserName(emailname);
		
		System.out.println(emailname);
		sign2.clickCreateButtonSignupForm();
		
		Thread.sleep(5000);
		
		UserRegistrationPage  userreg= new UserRegistrationPage(driver);
		
		//driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
		userreg.setgender();
		userreg.Setcustomerfirstname(custfirstname);
		userreg.Setcustomerlastname(custlastname);
		userreg.Setpassword(password);
		System.out.println(password);
		
		Thread.sleep(3000);
		userreg.clickdaydob();
		Thread.sleep(3000);
		userreg.setdaydob(day);
		Thread.sleep(3000);
		userreg.clickmonthdob();
		Thread.sleep(3000);
		userreg.setmonthdob(month);
		Thread.sleep(3000);
		userreg.clickyearhdob();
		Thread.sleep(3000);
		userreg.setyearhdob(year);
		
		Thread.sleep(5000);
		userreg.setcountry(country);
		Thread.sleep(3000);
		userreg.setfirstname(firstname);
		userreg.setlastname(Lastname);
		userreg.clickcountry();
		
		userreg.setcompany(company);
		Thread.sleep(3000);
		userreg.setaddress1(address1);
		userreg.setaddress2(address2);
		Thread.sleep(3000);
		userreg.setcity(city);
		Thread.sleep(3000);
		userreg.clickstate();
		Thread.sleep(3000);
		userreg.setstate(state);
		userreg.setpostcode(pincode);
		//userreg.setcountry(country);				
		userreg.setphone_mobile(phonenumber);
		userreg.setalias(alias);
	    
		userreg.registerbutton();
		
		Thread.sleep(3000);
		
		//boolean res= driver.getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders.");
		boolean res= driver.getPageSource().contains("klstebin");
		
	 if (res==true)
	 {
		 
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.assertTrue(false);
			captureScreen(driver,"userRegistrationTest");
	 }
		 
	





	}
	
}


