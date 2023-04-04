package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SynchronizationByProvidingImplicitlyWaitOnActiTime {

	static WebDriver driver;
	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://bhushan-shewale/login.do");
		String loginPageActualTitle = driver.getTitle();
		if (loginPageActualTitle.equals("actiTIME - Login")) {
			System.out.println("Test case passed Login Page Verify");
		} else {
			System.out.println("Test case failed Login Page Not Verify");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}

}
