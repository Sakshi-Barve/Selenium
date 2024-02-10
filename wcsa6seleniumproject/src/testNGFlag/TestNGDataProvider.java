package testNGFlag;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGDataProvider {
  static WebDriver driver;
  @Test
  public void googleSearch() {
	  driver.get("https://www.google.com/");
	  String title = driver.getTitle();
	  
	  
	  
  }
}
