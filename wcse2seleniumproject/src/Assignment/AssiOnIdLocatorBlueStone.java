package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssiOnIdLocatorBlueStone {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://crm.bluestone.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_username")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_password")).sendKeys("Bhushan@123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
