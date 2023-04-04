package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// READ THE DATA FROM EXCEL DATA
	public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);// provide the path of file.

		Workbook wb = WorkbookFactory.create(fis);// make the file ready for read

		Sheet sheet = wb.getSheet(sheetName);// get into the sheet

		Row row = sheet.getRow(rowCount);// get the desired row

		Cell cell = row.getCell(cellCount);// get the desired col/cell

		String data = cell.getStringCellValue();// read the data from cell

		return data;
	}
	
	//TO GET ROW COUNT
	
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		
		int rc = sheet.getLastRowNum();
		return rc;
	}
	
	//TO WRITE THE DATA IN EXCEL SHEET
	public void writeExcelData(String excelPath, String sheetName, int rowCount,int cellCount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
	}

}
