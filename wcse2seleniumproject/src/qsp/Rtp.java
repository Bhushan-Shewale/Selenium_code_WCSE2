package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Browser which you want!!!");
		String browserValue = sc.next();// ask the user input
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");// to avoid IlligalStsteException 
			WebDriver driver = new ChromeDriver();// launch the chromeBrowser
			driver.manage().window().maximize();//maximize the Parent windows
			driver.get("https://www.selenium.dev/");//launching the WebApplication.
			Thread.sleep(3000);
			driver.close();
		}
		else if(browserValue.equals("edge"))
		{
			System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");// to avoid IlligalStateException
			WebDriver driver= new EdgeDriver();// launch the Edge Browser
			driver.manage().window().maximize();//maximize the Parent windows
			driver.get("https://www.selenium.dev/");// launching the WebApplication.
			Thread.sleep(3000);
			driver.close();
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");// to avoid IlligalStateException
			WebDriver driver=new FirefoxDriver();// launch the Edge Browser
			driver.manage().window().maximize();//maximize the Parent windows
			driver.get("https://www.selenium.dev/");// launching the WebApplication.
			Thread.sleep(3000);
			driver.close();
		}
		else
		{
			System.out.println("Select valid browserValue!!!");
		}
	}
}
