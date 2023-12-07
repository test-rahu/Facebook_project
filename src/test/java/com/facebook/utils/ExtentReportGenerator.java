package com.facebook.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	//ExtentReportGenerator we have add an dependency in pom (ExtentReports from aventstack)
	//ExtentReportGenerator is class wr creating to generate the report for pass and fail test casees
	
	// ExtentSparkReporter>>  this class is responsible for whaterver report w r generating it is 
	//				responcble for set the property of that report like-name,theme
	//ExtentReports>> gets System Information(os, version)
	//ExtentTest>>    to generate specific test report
	
	//here w r create user define method 
	
	public static ExtentReports reportGenerator() {   //later we have change return type as ExtentReports bcz it return last method the ExtentReports
		
		
		//system property define below
		
		String path="C:\\Users\\Rahul Rathore\\eclipse-workspace\\FacebookProject\\Test_Reports\\LoginTest.html"; //w have giver our report path here
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("AutomATION_SCRIP_Report");
		reporter.config().setReportName("Test_login_report");
		reporter.config().setTheme(Theme.DARK);
		
		//below is the user define class w r using 
		//Tester related
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("WebApplication_","SocialMedia");
		extent.setSystemInfo("QA", "ABC_Test_Engineer");
		extent.setSystemInfo("O.S", "Windows");
		
		return extent;
		
		
		
		
	}

}
