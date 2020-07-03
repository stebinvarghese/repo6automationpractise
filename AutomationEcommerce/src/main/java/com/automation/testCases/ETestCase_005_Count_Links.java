package com.automation.testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ETestCase_005_Count_Links extends EBaseClass

{
	
	@Test
	public void linkscount() throws IOException, InterruptedException 
	
	{
		
	driver.get("https://www.guru99.com/");	
	List <WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println(links.size()); 
    
    Thread.sleep(5000);
    for (int i=0;i<=links.size(); i++)
    	
    {
    	
    WebElement element= 	   links.get(i);
    	
    String url=element.getAttribute("href");
    URL link= new URL(url);
    Thread.sleep(10000);
    HttpURLConnection httpconn	=(HttpURLConnection) link.openConnection();
    
    Thread.sleep(5000);
    
    httpconn.setRequestMethod("HEAD");
    httpconn.connect();
    Thread.sleep(5000);
    int resp= httpconn.getResponseCode();
    
    if (resp>=400)
    {
    	
    	System.out.println(url+"link is broken");
    	Thread.sleep(2000);
    }
    
    
    else
    {
    	
    	System.out.println(url+"link is not broken");
    	
    }
    
    Thread.sleep(5000);
	}
    
    
    
    
    
	}
	

}
	
	


