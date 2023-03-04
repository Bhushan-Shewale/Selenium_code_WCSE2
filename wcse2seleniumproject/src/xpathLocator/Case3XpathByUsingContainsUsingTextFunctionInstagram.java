package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3XpathByUsingContainsUsingTextFunctionInstagram {

	public static void main(String[] args)throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h4[contains(text(),'Selenium IDE')]")).click();
		Thread.sleep(2000);
		
		
	}

}
