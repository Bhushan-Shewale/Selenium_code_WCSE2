package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(invocationCount = 5)
  public void ft() {
	  
	  Reporter.log("Functional test Case is Executed", true);
  }
}
