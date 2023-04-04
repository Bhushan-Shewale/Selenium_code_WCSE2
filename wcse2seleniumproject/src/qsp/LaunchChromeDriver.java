package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeDriver {

	static WebDriver driver;
	public static void main(String[] args) {
		
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	new ChromeDriver(co);
	
	}
}
