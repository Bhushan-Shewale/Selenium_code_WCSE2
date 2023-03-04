package methodsOfWebElement;

import java.awt.Rectangle;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangleMethod {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//driver.get("https://www.selenium.dev/downloads/");
		
		//WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		//Rectangle rect = download.getRect();
		//int xaxis = rect.getX();
		//int yaxis = rect.getY();
		
		//int height = rect.getHeight();
		//int width = rect.getWidth();
		
		//System.out.println(xaxis);
		//System.out.println(yaxis);
		//System.out.println(height);
		//System.out.println(width);
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement download = driver.findElement(By.xpath("//h1[text()='Downloads']"));
		
		
		Rectangle rect = download.getRect();
		
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		
		System.out.println(xaxis+"  "+yaxis);
		
		int h = rect.getHeight();
		int w = rect.getWidth();
		
		System.out.println(h+"  "+w);
		
		System.out.println(download.getTagName());

	}

}
