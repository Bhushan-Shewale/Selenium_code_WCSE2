package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiOnIdLocatorBlueStone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://crm.bluestone.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_username")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_password")).sendKeys("Bhushan@123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
