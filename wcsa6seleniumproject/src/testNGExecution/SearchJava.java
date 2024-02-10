package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchJava {
  @Test
  public void java_Search_in_chrome() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  
	  driver.switchTo().activeElement().sendKeys("java", Keys.ENTER);
	  
	  Reporter.log("Java",true);
	  Thread.sleep(4000);
	  
	  driver.quit();
	  
  }
}
