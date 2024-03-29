package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(4000);
		// driver.close(); //close() is used for only close the parent window
		driver.quit();// quit() is used for close the both parent and child window
	}
}
