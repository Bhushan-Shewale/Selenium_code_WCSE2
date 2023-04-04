package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(
				"https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQiA0oagBhDHARIsAI-BbgeVBPeaxp_kRdQZwkJ-QC4n0MSLyvGetwQd-_Egft1w7vEV253BOA8aAqtxEALw_wcB");

		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch Jewellery ')]"));

		// WE ARE CREATE OBJECT FOR ACTION CLASS

		Actions act = new Actions(driver);
		//WE PERFORM MOUSE HOVER ACTION 
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Band')]")).click();

	}

}
