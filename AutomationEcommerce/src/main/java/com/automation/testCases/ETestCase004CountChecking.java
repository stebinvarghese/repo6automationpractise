package com.automation.testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.automation.pageObjects.LoginPageAutomation;

public class ETestCase004CountChecking extends EBaseClass{
	
	@Test
	public void LoginPageLinkCount()
	{
			
		
		driver.get("http://automationpractice.com/index.php");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}
	
	@Test  (priority=2)
	public void Homepage() 
	
{		driver.get(baseURLE);
		LoginPageAutomation lpa= new LoginPageAutomation(driver);		
		lpa.getEmailAddress(email);
		lpa.getpasswd(passwd);
		lpa.signinButton();
List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}