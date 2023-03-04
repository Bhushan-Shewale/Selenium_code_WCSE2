package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		String titleOfLoginPage = driver.getTitle();
		System.out.println(titleOfLoginPage);
		Thread.sleep(3000);
		driver.close();
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.instagram.com/");
		String titleOfLoginPage1=driver1.getTitle();
		System.out.println(titleOfLoginPage1);
		Thread.sleep(3000);
		driver.close();
	}
}
