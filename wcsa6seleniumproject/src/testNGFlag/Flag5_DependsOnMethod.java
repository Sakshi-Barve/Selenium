package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5_DependsOnMethod {
  @Test(description = "Used to create login")
  public void login() {
	  System.out.println("perform login");
  }
  
  @Test(description = "Used to create user", dependsOnMethods = "login")
  public void createUser()
  {
	  
	  System.out.println("Create user");
  }
  @Test(description = "Used to perform logout", dependsOnMethods = "createUser")
  public void logout()
  {
	  
	  System.out.println("perform logout");
  }
}
