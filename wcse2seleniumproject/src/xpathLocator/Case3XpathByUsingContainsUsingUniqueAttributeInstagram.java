package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3XpathByUsingContainsUsingUniqueAttributeInstagram {

	public static void main(String[] args)throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h4[contains(@class,'h3 mb-3 selenium-webdriver')]"));
		Thread.sleep(2000);
			
	}

}
