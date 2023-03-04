package operationalMethods;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicatesUsingHashSet {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/BHUSHAN/SELENIUM%20DATA/ZNotes/HTML/MultiSelectDropdown.html");
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropDownElement);
		
		HashSet<String> hs = new HashSet<String>();
		//Get the list of the web element
		
		List<WebElement> allOps = sel.getOptions();
		//read the list and get the text
		
		for(int i=0; i<allOps.size();i++)
		{
			WebElement options = allOps.get(i);
			String text = options.getText();
			
			//add the text to set so that duplicates won't be accepted and
			//insertion order is won't be maintained
			
			hs.add(text);
		}
		
		//read the set
		
		for(String value:hs)
		{
			System.out.println(value);
		}
	}

}
