package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiOnIdLocatorLenovo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.lenovo.com/in/en/login");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login.email.id")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login.password")).sendKeys("Bhushan@123");
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
