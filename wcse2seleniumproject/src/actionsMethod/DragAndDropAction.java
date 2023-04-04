package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement dd = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		Actions act = new Actions(driver);
		act.dragAndDrop(dd, target).perform();
		
		Thread.sleep(2000);
		WebElement dd2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='shoppingCart4']/descendant::li[1]"));
		
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(dd2, target2).perform();
		

	}

}
