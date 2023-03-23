package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Jayasree\\eclipse-workspace\\Maven\\Excel\\Book2.xlsx");
		FileInputStream fis = new FileInputStream(f); // to read the file
		Workbook wb = new XSSFWorkbook(fis);// to add here
		
		Sheet sheetName = wb.getSheet("Details");
		Row getRow = sheetName.getRow(1);
		Cell getCell = getRow.getCell(0);
		System.out.println(getCell);		

	}

}
