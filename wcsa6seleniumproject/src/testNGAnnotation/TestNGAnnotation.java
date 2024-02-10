package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
  @Test
  public void method_Test_Annotation() 
  {
	  Reporter.log("Test_Annotation", true);
  }
  
  @BeforeSuite
  public void method_Before_Suite()
  {
	  Reporter.log("Method before Suite", true);
  }
  
  @BeforeTest
  public void method_Before_Test()
  {
	  Reporter.log("Method before Test", true);
  }
  
  @BeforeMethod
  public void method_Before_Method()
  {
	  Reporter.log("Method Before Method", true);
  }
  
  @AfterMethod
  public void method_After_Method()
  {
	  Reporter.log("Method after Method", true);
	  
  }
  
  @AfterTest
  public void after_Test()
  {
	  Reporter.log("Method After Test", true);
  }
  
  @AfterSuite
  public void after_Suite()
  {
	  Reporter.log("Method After Suite", true);
  }
  
  @BeforeClass
  public void before_Class()
  {
	  Reporter.log("Method Before Class", true);
	 
  }
  
  @AfterClass
  public void after_Class()
  {
	  Reporter.log("Method After Class", true);
  }
}
