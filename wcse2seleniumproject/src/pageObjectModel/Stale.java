package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Stale {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();// IT IS USED TO HANDLED connectionFailedException
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://bhushan-shewale/login.do");

		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("admin");
		System.out.println(usn);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		usn.sendKeys("admin");
		System.out.println(usn);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);// TO AVOID StaleElementReferenceException TO AVOID FINDELEMENT AND FINDELEMENTS THAT TIME ONLY AND USE ANOTATION OF PASS BY
		
		//usn.clear();
		//System.out.println(usn);
		//usn.sendKeys("admin");

	}

}
