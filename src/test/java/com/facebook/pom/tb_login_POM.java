package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class tb_login_POM {
	
	//oops encapsulation we are using here
	//variable private and getter setter method use here
	WebDriver localdriver;
	public tb_login_POM(WebDriver remotedriver) { //creating a constructor for initializing the object
		
		localdriver=remotedriver;  //here script is running no need for me to initialize the localdriver and remotedriver(only driver is fine for this scrip)
		//aslo we have a page factory class its provide a certain method to perform the activity on ceratin page 
		
		PageFactory.initElements(remotedriver, this);  //this represent current class variable //super parent class veriable
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")        //findBy is a annotation use to find the webelement
	private WebElement email;  //here w r store the element as a webelement 
	
	@FindBy(how=How.XPATH, using="//input[@name='pass']")
	private WebElement pass;
	
	@FindBy(how=How.XPATH, using="//button[@name='login']")
	private WebElement login; 
	
	//now we have to create an method to perform the activity on that element 
	
	public void setEmail(String email_txt) {
		email.sendKeys(email_txt);
		
		
	}
	
	public void setPassword(String pass_txt) {
		pass.sendKeys(pass_txt);
		
	}
	
	public void actionClick() {
		login.click();
		
	}
	
	
	
	
	
	
	
}
