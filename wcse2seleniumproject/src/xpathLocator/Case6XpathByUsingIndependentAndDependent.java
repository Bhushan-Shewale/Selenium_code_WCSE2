package xpathLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Case6XpathByUsingIndependentAndDependent {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptops");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		// apply the filters
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[.='Operating System' and (@class='_2gmUFU _3V8rao')]")).click();
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 11']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='4★ & above']")).click();
		
		// price of 1st suggestion

		String priceOfLaptop = driver.findElement(By.xpath(
				"(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]"))
				.getText();
		System.out.println(priceOfLaptop);
		driver.quit();
	}
}
