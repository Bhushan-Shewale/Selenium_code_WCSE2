package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestActiTime {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

		driver.get("http://bhushan-shewale/login.do");

		// to read valid username from validcreds sheet

		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreads");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();

		// to read valid password from validcreds sheet

		FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("validcreads");
		Row row2 = sheet2.getRow(1);
		Cell cell2 = row2.getCell(1);
		String password = cell2.getStringCellValue();

		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
}
