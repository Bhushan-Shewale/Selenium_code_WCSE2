package testExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestingClass2 extends BaseTest {
  @Test
  public void search2() throws InterruptedException {
	  
	  driver.switchTo().activeElement().sendKeys("SQL", Keys.ENTER);
		Thread.sleep(2000);
  }
}
