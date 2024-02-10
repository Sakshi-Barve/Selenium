package testNGFlag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7_AlwaysRunFlag{
	//AlwaysRun flag is used to execute method or test case even if any previous method is failed or that are depends on each other
	@Test(description = "Performs Login")
	  public void loginMethod(){
		  System.out.println("THis method performs login operation");
	  }
	  
	  @Test(description = "Performs Create User", dependsOnMethods = "loginMethod")
	  public void createUserMethod()
	  {
		  //here we have used hard assert to fail the test case intentionally
		  Assert.fail();
		  System.out.println("This method is used to create user");
	  }
	  
	  @Test(description = "Performs Logout", alwaysRun = true)
	  public void logoutMethod()
	  {
		  System.out.println("This method is used to perform Logout operation");
	  }
	  
}
