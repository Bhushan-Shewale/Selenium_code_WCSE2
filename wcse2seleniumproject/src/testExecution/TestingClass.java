package testExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestingClass extends BaseTest {

	@Test
	public void search() throws InterruptedException {

		driver.switchTo().activeElement().sendKeys("Java", Keys.ENTER);
		Thread.sleep(2000);
	}

}
