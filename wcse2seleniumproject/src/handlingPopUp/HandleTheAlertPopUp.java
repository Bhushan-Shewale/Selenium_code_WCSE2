package handlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTheAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/Alert.html");

		// generate the Alert popup
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();

		// switch the controls to Alert popup
		// Thread.sleep(2000);
		Alert al = driver.switchTo().alert();

		// 1} Accept the alert Popup
		Thread.sleep(2000);
		// al.accept();

		// 2} Dismiss the alert Popup
		al.dismiss();

		// 3} Print the Text of alert Popup
		// System.out.println(al.getText());

		// 4} pass the characters to alert Popup
		// al.sendKeys("aaaaaa");

	}

}
