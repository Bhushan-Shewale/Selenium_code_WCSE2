package screenShotsPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class TakeScreenShotForWebElement {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		WebElement seleniumIDE = driver.findElement(By.xpath("//h4[.='Selenium IDE']/ancestor::div[@class='card-body']"));
		
		File src = seleniumIDE.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssForWebElement.jpg");
		
		Files.copy(src, dest);
		
	}

}
