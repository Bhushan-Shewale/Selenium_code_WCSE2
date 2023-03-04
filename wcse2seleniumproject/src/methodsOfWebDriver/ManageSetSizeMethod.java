package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageSetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);

		Dimension targetSize = new Dimension(475, 275);

		driver.manage().window().setSize(targetSize);
	}
	
}
