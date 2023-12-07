package com.facebook.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.facebook.pom.tb_login_POM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_fb_logon extends BaseClass {
	
//	 WebDriver driver;
	
	@Test
	
	public void verifyLogin() throws Exception {
		
		tb_login_POM log=new tb_login_POM(driver);
		log.setEmail(email);
		Thread.sleep(2000);
		log.setPassword(pass);
		Thread.sleep(2000);
		log.actionClick();
		Thread.sleep(2000);
		
	}
	
	//
	
	
	
	
	
	
	
	
	
	
}
