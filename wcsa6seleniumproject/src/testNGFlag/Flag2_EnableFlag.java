package testNGFlag;

import org.testng.annotations.Test;

public class Flag2_EnableFlag {
	@Test(description = "Performs Login", enabled = true)
	  public void loginMethod(){
		  System.out.println("THis method performs login operation");
	  }
	  
	  @Test(description = "Performs Create User", enabled = false)
	  public void createUserMethod()
	  {
		  System.out.println("This method is used to create user");
	  }
	  //default value of enabled Flag is true so the test case will get execute
	  @Test(description = "Performs Logout")
	  public void logoutMethod()
	  {
		  System.out.println("This method is used to perform Logout operation");
	  }
	  
}
