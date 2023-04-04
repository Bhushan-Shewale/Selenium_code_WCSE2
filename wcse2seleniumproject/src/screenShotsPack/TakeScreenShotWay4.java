package screenShotsPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.google.common.io.Files;

public class TakeScreenShotWay4 {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		EventFiringWebDriver eFW = new EventFiringWebDriver(driver);
		File src = eFW.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay4.jpg");
		
		Files.copy(src, dest);	//Files Class is belong to Google Package to store the Screenshots to the folder.

	}

}
