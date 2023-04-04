package testExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestingClass3 extends BaseTest {
	@Test
	  public void search2() throws InterruptedException {
		  
		  driver.switchTo().activeElement().sendKeys("TestNG Annotation", Keys.ENTER);
			Thread.sleep(2000);
	  }
}
