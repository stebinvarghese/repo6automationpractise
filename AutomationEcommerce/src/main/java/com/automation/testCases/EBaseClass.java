package com.automation.testCases;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation.utilities.ReadConfigAutomation;




public class EBaseClass {
	
	public static Logger logger;
	
	
	
	ReadConfigAutomation readconfiga= new ReadConfigAutomation();
	public String baseURLE=readconfiga.getApplicationURL();
	public String custlastname=readconfiga.custlastname();
	public String Lastname=readconfiga.Lastname();
	public String password=readconfiga.getpassword();
    public String company=readconfiga.company();
	public String address1=readconfiga.address1();
	public String address2=readconfiga.address2();
	public String city=readconfiga.getcity();
	public String pincode=readconfiga.getpincode();
	
	public String phonenumber=readconfiga.getphonenumber();
	public String alias=readconfiga.getalias();

	
	// for creating the test data random
	
public String emailname=randomestringemailid()+"ibin@gmail.com";	
public String custfirstname=randomcustfirstname()+"inil";
public String firstname=randomfirstname()+"inil";
public String day;
public String month;
public String year;
public String state;
public String country;


//

//Etestcase003 varibles list

public String emailb="";
public String passwdb="";


public String email="suresh@abc.com";
public String passwd="suresh";
public String emailw="suresh@abcd.com";
public String passwdw="sureshw";


public  WebDriver driver;
	
	@BeforeClass
	public void setup()
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Friends\\Downloads\\SeleniumFiles\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		driver= new FirefoxDriver();
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	public String randomestringemailid()
	{
		String generatedstringemailid=RandomStringUtils.randomAlphabetic(3);
		return(generatedstringemailid);
	}
	
		
	public String randomcustfirstname()
	{
		String generatedcustfirstname=RandomStringUtils.randomAlphabetic(1);
		return(generatedcustfirstname);
	}

	public String randomfirstname()
	{
		String generatedfirstname=RandomStringUtils.randomAlphabetic(1);
		return(generatedfirstname);
	}

	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	
	
	
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}