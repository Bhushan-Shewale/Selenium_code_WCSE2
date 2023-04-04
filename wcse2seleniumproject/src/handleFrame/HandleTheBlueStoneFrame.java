package handleFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleTheBlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		//Switch the Controls to Frame 
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		WebElement chatBox = driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']"));
		chatBox.click();
		
		driver.switchTo().parentFrame();
		WebElement nameTB = driver.findElement(By.id("chat-fc-name"));
		nameTB.sendKeys("Bhushan");

	}

}
