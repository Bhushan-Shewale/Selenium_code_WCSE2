package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/Username.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		driver.navigate().to("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/Single%20Select%20Dropdown.html");
		driver.findElement(By.tagName("select")).click();
		Thread.sleep(3000);
		
		driver.navigate().to("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/MultiSelectDropdown.html");
		driver.findElement(By.tagName("menu")).click();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
	}

}
