package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		driver.switchTo().activeElement().sendKeys("Phoebe Buffay", Keys.ENTER);

		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(4000);

		driver.close();

	}

}
