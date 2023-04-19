package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SynchronizationByProvidingImplicitlyWaitOnActiTime2 {

	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://bhushan-shewale/login.do");

		if (driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("If Login Page Title Is Matched!!, Test Case Is Passed");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}

		else {
			System.out.println("If Login Page Title Is Not Matched!!, Test Case Is Failed");
		}

		if (driver.getTitle().equals("actiTIME - Enter Time-Track")) {

			System.out.println("If Login Page Title Is Matched!!, Test Case Is Passed");

		} else {

			System.out.println("If Login Page Title Is Not Matched!!, Test Case Is Failed");

		}

	}

}
