package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.facebook.utils.Excel_data_provider;
import com.facebook.utils.config_Data_provider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	
	config_Data_provider read=new config_Data_provider(); //create the object of config_Data_provider class
	String url=read.getURL();
	String email=read.getEmail();
	String pass=read.getPassword(); //here we r call the method and that way ask the data from utils pck
	
	//abow code for file properties class using and below r the excel_sheet data 
	
//	Excel_data_provider edp=new Excel_data_provider();
//	String email1=edp.get_Excel_data("Sheet1", 1, 0);
//	String pass1=edp.get_Excel_data("Sheet1", 2, 0);
	
	@Parameters ("browser")
	
	
@BeforeClass
	
	public void browserSetup(String browser) throws Exception {        //we have pass string parametr as a argument in the method  //ita time for method run
	
		if(browser.equalsIgnoreCase("chrome"))
			
		{
//		WebDriverManager.firefoxdriver().setup();
//		driver=new FirefoxDriver();
		
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		
		if(browser.equalsIgnoreCase("edge")) {
			
			// here w have given if condition for compatibility testing doing changes in xml file also
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		}
		
	}

@AfterClass
public void teardown() {
	
	driver.close();
	
}


}
