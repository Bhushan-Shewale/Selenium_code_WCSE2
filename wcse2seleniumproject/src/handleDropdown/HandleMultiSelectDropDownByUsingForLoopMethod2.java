package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiSelectDropDownByUsingForLoopMethod2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/MultiSelectDropdown.html");
		driver.get("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/Single%20Select%20Dropdown.html");
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDownElement);
		
		for(int i=0; i<9; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}

	}

}
