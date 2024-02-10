package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;
	@Parameters({"Browser", "Url", "Username", "Password"})
  @Test
  public void select_Browser_Method(String browserValue, String url, String usn, String pass) {
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else 
		{
			Reporter.log("Please Enter valid browser value");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
  }
}
