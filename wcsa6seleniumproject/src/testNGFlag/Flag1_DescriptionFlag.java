package testNGFlag;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flag1_DescriptionFlag {
	static WebDriver driver;
  @Test(description = "Performs Login")
  public void loginMethod(){
	  
	  System.out.println("THis method performs login operation");
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://sakshi/login.do");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  driver.quit();
  }
  
  @Test(description = "Performs Create User")
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
