package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCssValueMethod {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement loginButton = driver
				.findElement(By.xpath("//button[contains(@class,'-button--main orangehrm-login-button')]"));
		String cssProperty = loginButton.getCssValue("font-size");
		System.out.println(cssProperty);
	}

}
