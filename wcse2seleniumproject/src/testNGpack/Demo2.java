package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void f1()
  { 
	  Reporter.log("method is f1", true);
  }
  
  @Test
  public void m2()
  {
	  Reporter.log("method is m2");
  }
  
  @Test
  public void m3()
  {
	  int a= 10/0;
	  System.out.println(a);
	  Reporter.log("method is m3");
  }
}
