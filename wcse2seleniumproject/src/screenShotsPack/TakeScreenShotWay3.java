package screenShotsPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class TakeScreenShotWay3 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		//UPCAST THE BROWSERSPECIFIC CLASSES INTO REMOTEWEBDRIVER(CLASS)
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay3.jpg");
		
		Files.copy(src, dest);

	}

}
