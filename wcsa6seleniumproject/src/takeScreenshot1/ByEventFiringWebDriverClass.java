package takeScreenshot1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriverClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		//line will come it is called as depricated  class means this class is rarely used 
		//it will work
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		File src = efwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot1/Facebook.png");
		Files.copy(src, dest);
		
	}

}
