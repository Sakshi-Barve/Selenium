package takeScreenshot1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDownCasting {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		//Downcast into remotewebDriver class
		RemoteWebDriver rwd= (RemoteWebDriver) driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshot1/selenium.jpg");
		//to copy and paste the screenshot in the specified folder
		Files.copy(src, dest);
	}
}
