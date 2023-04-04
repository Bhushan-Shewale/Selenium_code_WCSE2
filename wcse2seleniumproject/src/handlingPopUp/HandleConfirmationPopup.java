package handlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/Confirmation.html");

		// generate the Confirmation PopUp
		driver.findElement(By.tagName("input")).click();

		// switch the controls to confirmation pop up
		Alert al = driver.switchTo().alert();

		// accept confirmation popup
		Thread.sleep(2000);
		// al.accept();

		// dismiss confirmation popup
		// al.dismiss();

		// print the text of confirmation pop up
		System.out.println(al.getText());

	}

}
