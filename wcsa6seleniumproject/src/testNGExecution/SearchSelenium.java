package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchSelenium {
  @Test
  public void selenium_Search_in_chrome() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	  WebDriver driver= new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  
	  driver.switchTo().activeElement().sendKeys("selenium", Keys.ENTER);
	  
	  Reporter.log("selenium",true);
	  Thread.sleep(4000);
	  
	  driver.quit();
	  
  }
}
