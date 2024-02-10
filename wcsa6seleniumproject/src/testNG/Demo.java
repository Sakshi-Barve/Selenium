package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() 
  {
	  //Reporter.log("This is method 1");
	  Reporter.log("Method1", true);// If boolean value is true then it will print in both console o/p and testNG Reporter
	  //Reporter.log("Method1", false);// If boolean value is true then it will print in only in testNG Reporter
  }
  @Test
  public void method2()
  {
	  System.out.println("Method2");
  }
}
