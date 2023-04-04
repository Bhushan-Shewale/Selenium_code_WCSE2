package keyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeValidTestCases {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();//IT IS USED TO HANDLED connectionFailedException 
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);//UPCASTED INTO THE WEB DRIVER
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//SYNCHRONIZATION
		driver.get("http://bhushan-shewale/login.do");
		
		Flib flib = new Flib();
		
		String url = flib.readPropertyData("./data/config.properties","url");
		driver.get(url);
		
		String una = flib.readPropertyData("./data/config.properties", "username");
		String pass = flib.readPropertyData("./data/config.properties", "password");
		
		driver.findElement(By.name("username")).sendKeys(una);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();

	}

}
