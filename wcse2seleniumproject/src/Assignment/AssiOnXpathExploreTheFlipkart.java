package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiOnXpathExploreTheFlipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP Laptop");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='Brand' and(@class='_2gmUFU _3V8rao')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='Operating System' and(@class='_2gmUFU _3V8rao')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='3★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
