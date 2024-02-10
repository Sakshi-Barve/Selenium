package takeScreenshot1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByBrowserSpcificClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot1/Ajio.png");
		Files.copy(src, dest);
		
	}

}
