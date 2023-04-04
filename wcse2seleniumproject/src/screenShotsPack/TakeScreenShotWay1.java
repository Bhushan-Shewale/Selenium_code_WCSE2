package screenShotsPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class TakeScreenShotWay1 {

	public static void main(String[] args) throws IOException{
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//CREATE OF BROWSER SPECIFIC CLASSES NO NEED TO UPCAST INTO WEBDRIVER 
		//WE DO ALWAYS DOWNCASTING
		
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay1.jpg");
		
		Files.copy(src, dest);
		
	}

}
