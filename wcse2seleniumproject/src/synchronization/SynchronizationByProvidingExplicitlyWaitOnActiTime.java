package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationByProvidingExplicitlyWaitOnActiTime {

	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://bhushan-shewale/login.do");

		String loginPageActualTitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		if (wait.until(ExpectedConditions.titleContains(loginPageActualTitle))) {

			System.out.println("Login Page Title Is Matched!!, Test Case Passed!!");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

		} else {

			System.out.println("Login Page Title Is Not Matched!!, Test Case Failed!!");

		}

		String homePageTitle = driver.getTitle();
		if (wait.until(ExpectedConditions.titleContains(homePageTitle))) {

			System.out.println("Login Page Title Is Matched!!, Test Case Passed!!");

		} else {

			System.out.println("Login Page Title Is Not Matched!!, Test Case Failed!!");

		}

	}

}
