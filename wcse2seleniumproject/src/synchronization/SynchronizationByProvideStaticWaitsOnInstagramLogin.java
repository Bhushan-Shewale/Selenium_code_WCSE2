package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationByProvideStaticWaitsOnInstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);//Static Waits
		
		driver.findElement(By.name("username")).sendKeys("bhushanshevale3@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bhushan123");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		
	}

}
