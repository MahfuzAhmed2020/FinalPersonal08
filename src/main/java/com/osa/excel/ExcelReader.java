package com.osa.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void main(String[] args) throws IOException {

		ExcelReader er = new ExcelReader();
		ArrayList<String> data = er.getData("Python");
		System.out.println(data.get(0));
		// System.out.println(data.get(1));
		// System.out.println(data.get(2));

	}

	// Identify Testcases coloum by scanning the entire 1st row
	// once coloumn is identified then scan entire testcase coloum to identify
	// purcjhase testcase row
	// after you grab purchase testcase row = pull all the data of that row and feed
	// into test

	public ArrayList<String> getData(String testcaseName) throws IOException {
		// fileInputStream argument
		ArrayList<String> a = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("C:\\Users\\aakbu\\Desktop\\BookAuther\\Book_Auther.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Book");

		/*
		 * int sheets=workbook.getNumberOfSheets(); for(int i=0;i<sheets;i++) {
		 * if(workbook.getSheetName(i).equalsIgnoreCase("Book")) { XSSFSheet
		 * sheet=workbook.getSheetAt(i);
		 */
		// Identify Testcases coloum by scanning the entire 1st row

		Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
		Row firstrow = rows.next();
		Iterator<Cell> ce = firstrow.cellIterator();// row is collection of cells
		int k = 0;
		int coloumn = 0;
		while (ce.hasNext()) {
			Cell value = ce.next();

			if (value.getStringCellValue().equalsIgnoreCase("Developer_name")) {
				coloumn = k;

			}

			k++;
		}
		// System.out.println(coloumn);

		//// once coloumn is identified then scan entire testcase coloum to identify
		//// testcase row:
		while (rows.hasNext()) {

			Row r = rows.next();

			if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) {

				//// after you grab purchase testcase row = pull all the data of that row and
				//// feed into test

				Iterator<Cell> cv = r.cellIterator();
				while (cv.hasNext()) {
					Cell c = cv.next();
					if (c.getCellTypeEnum() == CellType.STRING) {

						a.add(c.getStringCellValue());
					} else {

						a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

					}
				}
			}

		}
		return a;

	}
	
/*public class ExcelFileReaderDemo {
	public static void main(String[] args) {
		Object [][]s=getValue();
		for (Object[] objects :s ) {
			for (Object s1 : objects) {
				System.out.println(s1);
			}
			
		}
		
		readToExcelByCell("a2");
		
	}

	public static Object[][] getValue() {
		Object [][]value=null;
		DataFormatter formate=new DataFormatter();
		try {
			FileInputStream fileInput=new FileInputStream(new File("C:\\Users\\mahfu\\Desktop\\ExelTemp\\TestDemo.xlsx"));
			XSSFWorkbook workbook=new XSSFWorkbook(fileInput);
			XSSFSheet sheet= workbook.getSheet("JsonData");
			int rowSize=sheet.getPhysicalNumberOfRows();
			int colSize=sheet.getRow(0).getLastCellNum();
			value=new Object[rowSize][colSize];
			Iterator<Row> rowIterator=sheet.rowIterator();
			 int rowNumber=0;
			while(rowIterator.hasNext()) {
				Row row=rowIterator.next();
				Iterator<Cell> cellIterator=row.cellIterator();
				int colNumber=0;
				while(cellIterator.hasNext()) {
					Cell cell=cellIterator.next();
					value[rowNumber][colNumber]=formate.formatCellValue(cell).trim();
					colNumber++;
				}
				rowNumber++;	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return value;
	}
	public static String readToExcelByCell(String cellNumber) {
		String value = null;
		// cellNumber.replace(oldChar, newChar)
		cellNumber = cellNumber.replace(":", "");
		try {
			InputStream file = new FileInputStream("C:\\Users\\mahfu\\Desktop\\ExelTemp\\TestDemo.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(file);
			XSSFSheet sheetName = workBook.getSheet("JsonData");
			CellReference cf = new CellReference(cellNumber);
			Row row = sheetName.getRow(cf.getRow());
			Cell cell = row.getCell(cf.getCol());
			value = cell.getStringCellValue();
			 System.out.println(value);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return value;
	}





}*/

	

}
