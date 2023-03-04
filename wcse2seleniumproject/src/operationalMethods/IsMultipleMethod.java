package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/Single%20Select%20Dropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropDownElement);
		System.out.println(sel.isMultiple());//Operational Method.
		
		driver.navigate().to("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/MultiSelectDropdown.html");
		WebElement dropDownElement1 = driver.findElement(By.id("i1"));
		Select sel1 = new Select(dropDownElement1);
		System.out.println(sel1.isMultiple());
		
	}

}
