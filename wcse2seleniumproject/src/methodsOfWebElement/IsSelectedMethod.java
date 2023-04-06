package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://bhushan-shewale/login.do");
		
		WebElement verify = driver.findElement(By.name("remember"));
		boolean status = verify.isSelected();
		System.out.println(status);
		Thread.sleep(3000);
		verify.click();
		boolean status2 = verify.isSelected();
		System.out.println(status2);
		
		
	}

}
