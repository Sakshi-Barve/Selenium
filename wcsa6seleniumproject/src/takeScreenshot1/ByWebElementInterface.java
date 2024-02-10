package takeScreenshot1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElementInterface {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='u_0_5_3l']"));
		Thread.sleep(2000);
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot1/loginButton.png");
		Files.copy(src, dest);
		
	}

}
