package testNGFlag;

import org.testng.annotations.Test;

public class Flag3_InvocationCount {
	@Test(description = "Performs Login")
	  public void loginMethod(){
		  System.out.println("THis method performs login operation");
	  }
	  //InvocationCount flag is used to execute annotation or method for multiple times
	//It acts like for loop
	  @Test(description = "Performs Create User", invocationCount = 10)
	  public void createUserMethod()
	  {
		  System.out.println("This method is used to create user");
	  }
	  
	  @Test(description = "Performs Logout")
	  public void logoutMethod()
	  {
		  System.out.println("This method is used to perform Logout operation");
	  }
	  
}
