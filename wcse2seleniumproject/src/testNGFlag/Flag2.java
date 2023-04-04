package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "This is used to search for DataBase")
  public void search1() {
	  
	  Reporter.log("SQL SEARCH", true);
  }
  
  @Test(description = "This is Functional Test Case")
  public void search2() {
	  
	  Reporter.log("Login Page", true);
  }  
}
