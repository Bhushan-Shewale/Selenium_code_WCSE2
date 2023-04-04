package handlingPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		// TO HANDLE USE METHOD OF CHROME OPTIONS  
	    options.addArguments("--disable-notifications");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		// WE WILL HANDLE THE NOTIFICATION POPUP

	}

}
