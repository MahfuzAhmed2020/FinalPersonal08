package com.osa.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderByCell {
	public static void main(String[] args) {
		System.out.println(readToExcelByCell("A1"));
		System.out.println(readToExcelByCell("B1"));
		System.out.println(readToExcelByCell("A2"));
		System.out.println(readToExcelByCell("A:2"));
		System.out.println(readToExcelByCell("a2"));
		System.out.println(readToExcelByCell("a:2"));
		System.out.println(readToExcelByCell("B:2"));

	}

	public static String readToExcelByCell(String cellNumber/*,String excelFilePath,String sheetName*/) {
		String value = null;
		// cellNumber.replace(oldChar, newChar)
		cellNumber = cellNumber.replace(":", "");
		try {
			InputStream file = new FileInputStream("C:\\Users\\mahfu\\Desktop\\TestData.xlsx"/*excelFilePath*/);
			XSSFWorkbook workBook = new XSSFWorkbook(file);
			XSSFSheet sheetName = workBook.getSheet("QA"/*sheetName*/);
			CellReference cf = new CellReference(cellNumber);
			Row row = sheetName.getRow(cf.getRow());
			Cell cell = row.getCell(cf.getCol());
			value = cell.getStringCellValue();
			// System.out.println(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return value;
	}

}
