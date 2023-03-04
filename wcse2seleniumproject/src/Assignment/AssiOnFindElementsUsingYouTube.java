package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiOnFindElementsUsingYouTube {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
		List<WebElement> option = driver.findElements(By.xpath("//span[@class='inline-metadata-item style-scope ytd-video-meta-block']/ancestor::div[@class='style-scope ytd-video-meta-block']/descendant::span[.='7.2M views']"));
		
		for(int i=0;i<options.size();i++)
		{
			String op = options.get(i).getText();
			
			for(int j=i;j<=i;j++)
			{
				String ops = option.get(j).getText();
				System.out.print(op+" "+ops);
			}
			System.out.println();
		}
	}

}
