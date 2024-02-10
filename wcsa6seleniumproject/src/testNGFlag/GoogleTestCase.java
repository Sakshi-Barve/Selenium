package testNGFlag;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleTestCase extends BaseTest{
  @Test
  public void search_for_Java() 
  {
	  driver.switchTo().activeElement().sendKeys("Java", Keys.ENTER);
  }
  @Test
  public void search_for_selenium()
  {
	  driver.switchTo().activeElement().sendKeys("Selenium", Keys.ENTER);
  }
  
  
}
