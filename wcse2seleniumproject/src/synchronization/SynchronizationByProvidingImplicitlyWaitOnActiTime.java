package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationByProvidingImplicitlyWaitOnActiTime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://bhushan-shewale/login.do");
		String loginPageActualTitle = driver.getTitle();
		if(loginPageActualTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test case passed Login Page Verify");
		}
		else
		{
			System.out.println("Test case failed Login Page Not Verify");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}

}
