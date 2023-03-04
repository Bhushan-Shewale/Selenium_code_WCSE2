package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4XpathByUsingMultipleAttributeIRCTC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8')]")).sendKeys("Pune");
		driver.findElement(By.xpath("//span[@class='ng-star-inserted' and (text()='PUNE JN - PUNE')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9')]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ng-star-inserted' and (text()='MUMBAI CENTRAL - MMCT')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10')]")).click();
		driver.findElement(By.xpath("//a[.='11']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[.='Flexible With Date']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down']")).click();
		driver.findElement(By.xpath("//span[@class='ng-star-inserted' and(text()='AC First Class (1A) ')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
		Thread.sleep(4000);
		driver.close();		
		
	}

}
