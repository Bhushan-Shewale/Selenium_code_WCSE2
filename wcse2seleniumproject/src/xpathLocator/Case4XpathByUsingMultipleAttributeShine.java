package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4XpathByUsingMultipleAttributeShine {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shine.com/registration/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("Bhushan");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'id_email')]")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("9511715148");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("Bhushan@123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@id,'registerButton')]")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
