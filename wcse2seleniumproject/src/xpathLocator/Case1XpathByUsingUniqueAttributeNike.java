package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Case1XpathByUsingUniqueAttributeNike {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Bhushan@123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
