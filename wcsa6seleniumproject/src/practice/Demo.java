package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void m1() {
	  //Reporter.log("This Is Demo");
	  //It will print in console only
	 // System.out.println("This is Demo");
	  
	  Reporter.log("", false);
  }
}
