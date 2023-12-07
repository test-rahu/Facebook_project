package com.facebook.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class config_Data_provider {
	public Properties pro;   //here we create it as a instance for access the whole class
	//constructor---->>file----->object create
	//if we create a constructor it will initialize the objet thats how object can aquire all the 
	//property of that class, thats why w r creating the constructor of that class name 
	
	public config_Data_provider() {
		
		String path="C:\\Users\\Rahul Rathore\\eclipse-workspace\\FacebookProject\\config_properties\\config_data";
		File source=new File(path);   //load the file 
		
		try {
		FileInputStream fis=new FileInputStream(source);   //loaded file getting here in byte 
		//to get data from file we user properties class
				 pro=new Properties();
				pro.load(fis);
		
		
		//FileInputStream it ask the expection rather than throw execption we r handling here as a try and catch block
		
		}catch(Exception e){
			System.out.println(e);
			
		}
		
		
		
		
	}
	//now we have get the file bt for gettting the data from file w r creating the method here, belo r the method
	
	public String getURL() {						//we have a .getproperty method to get/load the data from file
		String url_Txt=pro.getProperty("URL");     //here we have to provide the key as in mention in the file 
		return url_Txt;  //here is a getter method thats y we have return the variable/  
				//get.property ask u a key(URL)
	}
	
	public String getEmail() {
		String email_Txt=pro.getProperty("Email");     //here we have to provide the key as in mention in the file 
		return email_Txt;  //here is a getter method thats y we have return the variable/
	}
	
	public String getPassword() {
		String password_Txt=pro.getProperty("Password");     //here we have to provide the key as in mention in the file 
		return password_Txt;  //here is a getter method thats y we have return the variable/
	}
	
}
