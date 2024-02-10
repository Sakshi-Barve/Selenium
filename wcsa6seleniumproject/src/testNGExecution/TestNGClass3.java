package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass3 {
  @Test
  public void method5() {
	  Reporter.log("TestNGClass3 : method5", true);
  }
  
  @Test
  public void method6()
  {
	  int x=5;
	  float i= x/5;
	  Reporter.log("TestNGClass3 : method6" , true);
  }
  
}
