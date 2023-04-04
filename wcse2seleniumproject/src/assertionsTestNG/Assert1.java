package assertionsTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
  @Test
  public void validLogin() {
	  
	  Reporter.log("Launch the Browser", true);
	  Reporter.log("Launch the Web Page by using URL", true);
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(false, true);
	  Reporter.log("Login Page will be Displayed", true);
	  Reporter.log("Perform the Login Operation", true);
	  Assert.assertEquals(true, false);
	  Reporter.log("Home Page will be Displayed", true);
	  Reporter.log("Logout!!!", true);
  }
}
