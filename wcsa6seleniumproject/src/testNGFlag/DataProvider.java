package testNGFlag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test(dataProvider = "ActiData")
public class DataProvider {
  public void setUp(String usn, String pwd) 
  {
	  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	  WebDriver driver= new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://sakshi/login.do");
	  driver.findElement(By.name("username")).sendKeys(usn);
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
	  driver.findElement(By.id("loginButton")).click();
  }
  

  
  //using data provider we can acheive data driven
  @org.testng.annotations.DataProvider(name = "ActiData")
  public Object[][] testData()
  {
	  Object [][] data=new Object [5] [2] ;
	  //Invalid Data
	  data [0] [0] = "admin";
	  data [0] [1] ="manager123";
	  
	  data [1] [0] ="a dmin";
	  data [1] [1]= "manger";
	 
	  data[2] [0]="123admin";
	  data[2] [1]="manager";
	  
	  data[3] [0]="admin@12";
	  data[3] [1]="manage";
	  
	  //valid Data
	  data[4] [0]="admin";
	  data[4] [1]="manager";
	  return data;
  }
	
}
