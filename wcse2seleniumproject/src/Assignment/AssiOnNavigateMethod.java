package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiOnNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window () .maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();// 
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		Point targetPosition = new Point(350, 250);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(2000);
		
		Dimension targetSize = new Dimension(475, 275);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		
		driver.close();

	}

}
