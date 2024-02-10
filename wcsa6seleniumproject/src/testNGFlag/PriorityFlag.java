package testNGFlag;

import org.apache.log4j.Priority;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test(priority = 1)
  public void f() {
	  Reporter.log("f",true);
  }
  
  @Test(priority = -1)
  public void a()
  {
	  Reporter.log("a",true);
  }
  
}
