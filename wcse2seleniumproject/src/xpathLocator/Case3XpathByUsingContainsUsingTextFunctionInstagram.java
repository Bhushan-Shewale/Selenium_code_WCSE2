package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Case3XpathByUsingContainsUsingTextFunctionInstagram {

	public static void main(String[] args)throws InterruptedException { 
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h4[contains(text(),'Selenium IDE')]")).click();
		Thread.sleep(2000);
		
		
	}

}
