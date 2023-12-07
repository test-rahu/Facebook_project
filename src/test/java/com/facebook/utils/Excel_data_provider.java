package com.facebook.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data_provider {
	XSSFWorkbook workbook;
	
	public Excel_data_provider() {
	
		
	
	String Excel_path="C:\\Users\\Rahul Rathore\\eclipse-workspace\\FacebookProject\\Excel_sheet_Data\\test_data.xlsx";
	
	try {
	FileInputStream fis=new FileInputStream(Excel_path); //load the file
	 workbook=new XSSFWorkbook(fis);   //read the file
	} catch(Exception e) {
		
		System.out.println(e);
	}
	
	}
	public String get_Excel_data(String sheetName, int rowNum, int cellNum)//w r passing this argument bcz if w want to change the test data
		//then w r not changing the code always>> here w change the aurgument only
	{
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}
	
	
}
