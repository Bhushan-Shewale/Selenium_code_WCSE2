package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void f2() {
	  
	  Reporter.log("Bhushan!!!", true);
  }
  @Test
  public void m() {
	  
	  Reporter.log("method is m", true);
  }
  @Test
  public void m1() {
	  
	  Reporter.log("method is m1", true);
  }
}
