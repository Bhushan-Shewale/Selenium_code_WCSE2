package testExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExecution {
  @Test
  public void method() {
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid + "Is The Threadid", true);
	  Reporter.log("method", true);
  }
  
  @Test
  public void method2() {
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid + "Is The Threadid", true);
	  Reporter.log("method2", true);
  }
}
