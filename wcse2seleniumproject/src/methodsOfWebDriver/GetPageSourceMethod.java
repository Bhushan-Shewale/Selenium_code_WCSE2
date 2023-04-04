package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		String SourceCode = driver.getPageSource();
		Thread.sleep(2000);
		System.out.println(SourceCode);
	}
}
