package keyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// WE ARE USE FILE LIABRARY CLASS FOR TO STORE THE GENERIC REUSABLE METHOD

	// GENERIC REUSABLE METHOD TO READ THE DATA FROM EXCEL SHEET

	public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);// provide the path of file.
		Workbook wb = WorkbookFactory.create(fis);// make the file ready for read
		Sheet sheet = wb.getSheet(sheetName);// get into the sheet
		Row row = sheet.getRow(rowCount);// get the desired row
		Cell cell = row.getCell(cellCount);// get the desired column/cell
		String data = cell.getStringCellValue();// read the data from cell
		return data;
	}

	// GENERIC REUSABLE METHOD TO GET LAST rowCount
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);

		int rc = sheet.getLastRowNum();
		return rc;
	}

	// GENERIC REUSABLE METHOD TO WRITE THE DATA IN EXCEL SHEET
	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data)
			throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
	}

	// GENERIC REUSABLE METHOD TO READ THE DATA FROM PROPERTY FILE
	public String readPropertyData(String propPath,String key) throws IOException {
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

}
