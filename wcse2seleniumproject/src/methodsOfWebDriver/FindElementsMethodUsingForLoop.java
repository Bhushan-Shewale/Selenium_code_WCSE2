package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethodUsingForLoop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("iphone");
		
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(int i=0;i<options.size();i++)
		{
			WebElement opt = options.get(i);
			String iphones = opt.getText();
			System.out.println(iphones);
			Thread.sleep(2000);
		}

	}

}
