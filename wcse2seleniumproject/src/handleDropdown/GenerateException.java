package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/Single%20Select%20Dropdown.html");
		
		WebElement food = driver.findElement(By.name("menu"));
		
		Select sel = new Select(food);
		sel.selectByVisibleText("chickenhandi");
		Thread.sleep(2000);
		sel.deselectByVisibleText("chickenhandi");

	}

}
