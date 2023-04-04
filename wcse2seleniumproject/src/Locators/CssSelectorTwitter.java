package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTwitter {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);

		driver.findElement(By.name("text")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("div[class^='css-18t94o4 css-1dbjc4n r-s']")).click();
		Thread.sleep(1000);

		driver.close();
	}
}
