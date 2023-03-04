package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4XpathByUsingMultipleAttributeAjio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='username']")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='login-btn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@class='gender-opt' and(text()='Male')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bhushan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile']")).sendKeys("9511715148");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Bhushan@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='tnc' and (.=' By Signing Up, I agree to ')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class,'login-form-inputs l')]")).click();
		Thread.sleep(2000);
		
	}

}
