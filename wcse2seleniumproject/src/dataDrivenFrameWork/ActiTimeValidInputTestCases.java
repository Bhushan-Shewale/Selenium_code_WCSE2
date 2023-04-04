package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeValidInputTestCases {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);//UPCASTED INTO THE WEB DRIVER
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//SYNCHRONIZATION
		driver.get("http://bhushan-shewale/login.do");
		
		//WE READ THE MULTIPLE DATA FROM EXCEL SHEET we need the FILE LIABRARY  
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreads",1, 0);
		String password = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreads",1, 1);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}


}
