package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f()
  {
	  Reporter.log("Sunday!!!", true);
  }
  
  @Test
  public void a1()
  {
	  Reporter.log("method is a1", true);
  }
  
  @Test
  public void a2()
  {
	  Reporter.log("method is a2", true);
  }
}
