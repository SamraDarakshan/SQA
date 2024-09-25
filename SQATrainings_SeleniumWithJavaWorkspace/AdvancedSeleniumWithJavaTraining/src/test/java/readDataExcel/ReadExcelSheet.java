package readDataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheet {

	@Test
	public void dataReadTest() throws IOException {
		
		File src = new File ("D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\readData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
	
		//load whole excel book poi
		//xlsx
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		//for .xls
		//HSSFWorkbook hsf = new HSSFWorkbook(fis);
	
		//first sheet 0 index
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		//reading data from specific row n column
	
		String entry1 = sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("The first record of the data sheet in the file is "+entry1);
		
		// Get total number of rows and columns
		int totalRows = sheet.getPhysicalNumberOfRows();  // Get total rows
		int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();  // Get total columns in the first row

		for (int rowIndex = 0; rowIndex < totalRows; rowIndex++) {
		    // Get the current row
		    XSSFRow row = sheet.getRow(rowIndex);

		    for (int colIndex = 0; colIndex < totalColumns; colIndex++) {
		        // Get the current cell value (assuming it's a string)
		        String cellValue = row.getCell(colIndex).getStringCellValue();

		        // Print the row, column, and cell value
		        System.out.println("Row: " + rowIndex + ", Column: " + colIndex + ", Value: " + cellValue);
		    }
		}

	}
	
}
/*
Explanation:
sheet.getPhysicalNumberOfRows(): Gets the total number of rows.
sheet.getRow(rowIndex): Accesses a specific row by index.
sheet.getRow(0).getPhysicalNumberOfCells(): Gets the total number of columns (assuming all rows have the same number of columns).
row.getCell(colIndex).getStringCellValue(): Retrieves the value of the cell at a given row and column.

*/