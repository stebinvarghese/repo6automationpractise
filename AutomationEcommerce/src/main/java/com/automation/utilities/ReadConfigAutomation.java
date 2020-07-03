package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public  class ReadConfigAutomation {

	
		Properties pro;
			
			public ReadConfigAutomation()
			{
				File src = new File("./Configurations/Config.properties");

				try {
					FileInputStream fis = new FileInputStream(src);
					pro = new Properties();
					pro.load(fis);
				} catch (Exception e) {
					System.out.println("Exception is " + e.getMessage());
				}
			}
			
				
			public String getChromePath()
			{
			String chromepath=pro.getProperty("chromepath");
			return chromepath;
			}
			
			
			public String getFirefoxPath()
			{
			String firefoxpath=pro.getProperty("firefoxpath");
			return firefoxpath;
			}

			// for application url
			public String getApplicationURL()
			{
				String baseURLE=pro.getProperty("baseURLE");
				return baseURLE;
			}
			
			
			// for registration page
			
			

			public String custlastname()
			{
				String custlastname=pro.getProperty("custlastname");
				return custlastname;
			}
			
			
			public String getpassword()
			{
				String password=pro.getProperty("password");
				return password;
			}
				
			public String Lastname()
			{
				String Lastname=pro.getProperty("Lastname");
				return Lastname;
			}
			

			public String company()
			{
				String company=pro.getProperty("Lastname");
				return company;
			}
			
			
			public String address1()
			{
				String address1=pro.getProperty("address1");
				return address1;
			}
			
			
			
			public String address2()
			{
				String address2=pro.getProperty("address2");
				return address2;
			}
			
				
			
			public String getcity()
			{
				String city=pro.getProperty("city");
				return city;
			}
			
			public String getpincode()
			{
				String pincode=pro.getProperty("pincode");
				return pincode;
			}
			
			
			public String getphonenumber()
			{
				String phonenumber=pro.getProperty("phonenumber");
				return phonenumber;
			}
			
				
			public String getalias()
			{
				String alias=pro.getProperty("alias");
				return alias;
			}
			
			
			

	}	
			
			

			
			
			
			
