package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class UserRegistrationPage {
	public WebDriver driver;

	public UserRegistrationPage(WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	//Sign up form email id


@FindBy (id= "id_gender1")
WebElement titlemr;

		
public void setgender()

{
titlemr.click();
	
}


@FindBy (id="customer_firstname")
WebElement customerfirstnametextbox;
			
public void Setcustomerfirstname(String custfirstname )
{
	customerfirstnametextbox.sendKeys(custfirstname);	
}
	
	
	
@FindBy (id="customer_lastname" )
WebElement customerlastnametextbox;

public void Setcustomerlastname(String custlastname )

{
	customerlastnametextbox.sendKeys(custlastname);
}


@FindBy (id="passwd" )
WebElement passwordtextbox;

public void Setpassword (String password )

{
	passwordtextbox.sendKeys(password);
	
}


@FindBy (id="firstname" )
WebElement firstnametextbox;

public void setfirstname(String firstname)

{
	firstnametextbox.sendKeys(firstname);
	
}


@FindBy (id="lastname" )
WebElement lastnametextbox;

public void setlastname(String lastname)

{
	lastnametextbox.sendKeys(lastname);
	
}



@FindBy (id="company" )
WebElement companytextbox;

public void setcompany(String company)

{
	companytextbox.sendKeys(company);
	
}


@FindBy (name="address1" )
WebElement address1textbox;

public void setaddress1(String address1)

{
	address1textbox.sendKeys(address1);
	
}



@FindBy (id="address2" )
WebElement address2textbox;

public void setaddress2(String address2)

{
	address2textbox.sendKeys(address2);
	
}



@FindBy (id="city" )
WebElement citytextbox;


public void setcity(String city)

{
	 citytextbox.sendKeys(city);
	
}

@FindBy (id="postcode" )
WebElement  postcodetextbox;

public void setpostcode(String postcode)

{
	postcodetextbox.sendKeys(String.valueOf(postcode));
	
}


//@FindBy (id="country" )
//WebElement countrytextbox;

@FindBy (id="phone_mobile" )
WebElement  phone_mobiletextbox;

public void setphone_mobile(String phone_mobile)

{
	phone_mobiletextbox.sendKeys(phone_mobile);
	
}



@FindBy (id="alias" )
WebElement   aliastextbox;

public void setalias(String alias)

{
 aliastextbox.sendKeys(alias);
	
}

//span[contains(text(),'Register')]



@FindBy (id="days" )
WebElement   daysdeopdowbox;


public void clickdaydob()
{
	 daysdeopdowbox.click();

}


public void setdaydob(String day)
{
	Select days= new Select(daysdeopdowbox);
			//days.selectByVisibleText(day);
	days.selectByIndex(12);
}
	
	
@FindBy (id="months" )
WebElement   monthsdeopdowbox;


public void clickmonthdob()
{
	monthsdeopdowbox.click();
}

public void setmonthdob(String month)
{
	Select months= new Select(monthsdeopdowbox);
	months.selectByIndex(12);
}
		
	
	
@FindBy (id="years" )
WebElement   yearsdeopdowbox;

public void clickyearhdob ()
{
	yearsdeopdowbox.click();
}



public void setyearhdob(String year)
{
	Select years= new Select(yearsdeopdowbox);
	years.selectByIndex(50);
}
		
	
	
@FindBy (id="id_country" )
WebElement   countrydeopdowbox;

public void clickcountry()
{
	countrydeopdowbox.click();
}

public void setcountry(String country)
{
	Select countries= new Select(countrydeopdowbox);
	countries.selectByIndex(1);
}
		

@FindBy (id="id_state" )
WebElement   statedeopdowbox;

public void clickstate()
{
	statedeopdowbox.click();
}


public void setstate(String state)
{
	Select states= new Select(statedeopdowbox);
	states.selectByIndex(39);
}




@FindBy (xpath="//span[contains(text(),'Register')]" )
WebElement   registerbutton;
	
	
	
public void  registerbutton()
{
	registerbutton.click();
}


	
}
