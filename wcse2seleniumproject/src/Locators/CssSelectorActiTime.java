package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://bhushan-shewale/login.do");
		Thread.sleep(1000);

		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);

		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);

		driver.close();

	}

}
