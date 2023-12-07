package com.facebook.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listner implements ITestListener {  //w r implements this interface bcz it has some abstract method which r 
		//provide template when test execution is start that time we can give the method propertys
	
	//below is the user definr ,method refernce 
	ExtentTest test;
	//using the above refernce w r checking/showinth the method pass fail results
	ExtentReports extent=ExtentReportGenerator.reportGenerator();  //all property w have store in extent variable
	
	//suppose w have 60 tet case  for that w use ThreadLocal class and provide generic extent test
	//by creating object of below class we r store all report and attach the below method 
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getTestClass().getName()+ ""+result.getMethod().getMethodName());
		extenttest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test is pass");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "TestCase is failled");
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "TestCase is Skipped");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
		
	}
	
	

}
