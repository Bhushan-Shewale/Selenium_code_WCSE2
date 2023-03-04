package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userNameTB = driver.findElement(By.name("username"));
		System.out.println(userNameTB.getText());
		WebElement passwordTB = driver.findElement(By.name("password"));
		System.out.println(passwordTB.getText());
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		System.out.println(loginButton.getText());
		
	}

}
