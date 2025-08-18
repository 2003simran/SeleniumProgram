package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataIntoExcelSheet {

	public static void main(String[] args) throws Throwable {

FileInputStream fis = new FileInputStream("./src/test/resources/TestDataBook.xlsx");
		
		//step2:-keep excel file in read mode
		Workbook book = WorkbookFactory.create(fis);
	
		//step3:-gets the control of the sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.createRow(5);
		
		Cell cell = row.createCell(2);
	
		cell.setCellValue("Qspiders");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/TestDataBook.xlsx");
		book.write(fos);
		book.close();

	}

}
