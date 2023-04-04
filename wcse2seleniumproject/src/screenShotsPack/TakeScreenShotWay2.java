package screenShotsPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenShotWay2 {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		//WAY2 DOWNCAST INTO RemoteWebDriver(CLASS)
		
		RemoteWebDriver rw = (RemoteWebDriver)driver;
		
		File src = rw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay2.png");
		
		Files.copy(src, dest);

	}

}
