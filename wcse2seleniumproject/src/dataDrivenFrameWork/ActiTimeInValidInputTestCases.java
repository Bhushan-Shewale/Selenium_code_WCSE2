package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeInValidInputTestCases {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);//UPCASTED INTO THE WEB DRIVER
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//SYNCHRONIZATION
		driver.get("http://bhushan-shewale/login.do");
		
		//WE READ THE MULTIPLE DATA FROM EXCEL SHEET we need the FILE LIABRARY  
		Flib flib = new Flib();
		
		int rc = flib.rowCount("./data/ActiTimeTestData.xlsx", "invalidcreads");
		for(int i=1; i<=rc; i++)
		{
		String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreads",i, 0);
		String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreads",i, 1);
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(invalidUsername);
		driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
		}
		driver.close();
	}

}
