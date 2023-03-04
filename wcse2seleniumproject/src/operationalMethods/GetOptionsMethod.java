package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/Single%20Select%20Dropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropDownElement);
		System.out.println(sel.isMultiple());//Operational Method.
		//all the options of Single Select Dropdown
		
		List<WebElement> allOps = sel.getOptions();
		
		for(int i=0; i<allOps.size();i++)
		{
			//print the all the options from Dropdown 
			String option = allOps.get(i).getText();
			System.out.println(option);
		}
		//---------------------------------------------------------------------------------------------------------------
		//For MultiSelect DropDown
		
		
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/MultiSelectDropdown.html");
		WebElement dropDownElement1 = driver.findElement(By.id("i1"));
		Select sel1 = new Select(dropDownElement1);
		System.out.println(sel1.isMultiple());
		
		List<WebElement> allOps1 = sel1.getOptions();
		for(WebElement options1:allOps1)
		{
			System.out.println(options1.getText());
		}

	}

}
