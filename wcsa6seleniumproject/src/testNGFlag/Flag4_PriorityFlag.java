package testNGFlag;

import org.testng.annotations.Test;

public class Flag4_PriorityFlag {
	//priority flag is used to execute the test cases or methods according to the priority given
	//lesser priority higher execution
	//same priority methods always executing in alphabetical order
	//negative priority execute first if it is declared 
	@Test(description = "Performs Login", priority = 1)
	  public void loginMethod(){
		  System.out.println("THis method performs login operation");
	  }
	  
	  @Test(description = "Performs Create User", priority = 2)
	  public void createUserMethod()
	  {
		  System.out.println("This method is used to create user");
	  }
	  
	  @Test(description = "Performs Logout", priority = 3)
	  public void logoutMethod()
	  {
		  System.out.println("This method is used to perform Logout operation");
	  }
	  
}
