package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertion1 {
  static WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  SoftAssert sa = new SoftAssert();
	  String titleOfPage = "OrangeHRM";
	  sa.assertEquals(driver.getTitle(), titleOfPage);
	  
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(2000);
	  //Apply hard assert
	 driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	 Thread.sleep(2000);
	 WebElement logout = driver.findElement(By.partialLinkText("Logout"));
	 Assert.assertEquals(logout.isDisplayed(), true);
	 Thread.sleep(2000);
	 logout.click();
	 sa.assertAll();
  }
}
