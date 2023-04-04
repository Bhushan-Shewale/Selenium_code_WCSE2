package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(enabled = false) 
  public void login() {
	  Reporter.log("Login Method", true);
  }
  
  @Test(enabled = true) 
  public void logout() {
	  Reporter.log("Logout Method", true);
  }
  
}
