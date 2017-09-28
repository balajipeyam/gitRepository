package com.balaji.begin.excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException, InvalidFormatException {

		File f1 = new File("C://Users//balaji_pandurangam//Desktop//people.xlsx");
		// OPCPackage pkg = OPCPackage.open(f1);
		try {
			FileInputStream fis = new FileInputStream(f1);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			for (int i = 0; i < rowCount; i++) {
				XSSFRow row = sheet.getRow(i);
			
				XSSFCell cell = row.getCell(0);
				
				
				System.out.println(cell);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
