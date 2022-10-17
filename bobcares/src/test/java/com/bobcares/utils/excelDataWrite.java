package com.bobcares.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelDataWrite {
	@Test
	public static void main(String out_1) throws IOException { 
		
		String filePath = "C:\\Users\\nandu\\git\\PIV\\bobcares\\src\\test\\java\\com\\bobcares\\testdata\\write excel.xls"; 

		File file = new File(filePath); 

		FileInputStream fis = new FileInputStream(file); 

		XSSFWorkbook wb = new XSSFWorkbook(fis); 

		XSSFSheet sheet=wb.getSheet("Sheet1"); 

		XSSFRow row = sheet.getRow(1); // Return type of getRow method is a XSSFRow. 
//		int i ;
//		for (i=0;i>0;i++);
		XSSFCell cell = row.createCell(1); 
		cell.setCellValue(out_1); // This method returns nothing. 

		FileOutputStream fos = new FileOutputStream(filePath); 

		wb.write(fos); 

		fos.close(); 

		System.out.println("Result Written Successfully"); 

	}
}
