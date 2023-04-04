package keyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {

	static WebDriver driver;

	public void setUp() throws IOException {
		// OPEN THE BROWSER

		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");//IT IS RESPONSIBLE FOR READ THE PROPERTY FILE WE PASS PATH AND URL 
		if (browserValue.equals("chrome"))
		{

			System.setProperty(CHROME_KEY, CHROME_PATH);
			ChromeOptions co = new ChromeOptions();// IT IS USED TO HANDLED connectionFailedException
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		else if(browserValue.equals("Firefox"))
		{
			//System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		else
		{
			System.out.println("invalid browserValue!!");
		}
	}
	public void tearDown()//THIS IMPLEMENTATION FOR CLOSE THE BROWSER 
	{
		driver.quit();
	}
}
