package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Jayasree\\eclipse-workspace\\Maven\\Excel\\Book3.xlsx");
		FileOutputStream fos = new FileOutputStream(f); // to write a file
		Workbook wb = new XSSFWorkbook(); // to add here
		
		Sheet sheetName = wb.createSheet("Data");
		Row createRow = sheetName.createRow(0);
		createRow.createCell(0).setCellValue("Selenium");
		createRow.createCell(1).setCellValue("Java");
		createRow.createCell(2).setCellValue("Data Driven");
		createRow.createCell(3).setCellValue("POM");
		
		Row createRow1 = sheetName.createRow(1);
		createRow1.createCell(0).setCellValue("Appium");
		createRow1.createCell(1).setCellValue("Cucumber");
		createRow1.createCell(2).setCellValue("Junit");
		createRow1.createCell(3).setCellValue("TestNG");
		
		wb.write(fos);
		

	}

}
