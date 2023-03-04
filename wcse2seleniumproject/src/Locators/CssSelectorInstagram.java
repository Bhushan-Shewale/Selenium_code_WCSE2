package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("Bhushan@123");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("button[class^='_acan _acap']")).click();
		Thread.sleep(2000);

		driver.close();
	}

}
