package com.automation.testCases;

import org.testng.annotations.Test;

import com.automation.pageObjects.SignupPage;

public class ETestCase00 extends EBaseClass{
	
	@Test
	public void signup() {
	driver.get(baseURLE);
	SignupPage sign= new SignupPage(driver);
	
	sign.setUserName(emailname);
	sign.clickCreateButtonSignupForm();
	}

}
