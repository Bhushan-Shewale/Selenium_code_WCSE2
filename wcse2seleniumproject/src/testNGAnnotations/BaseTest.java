package testNGAnnotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	static WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@BeforeTest
	public void property()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
}
