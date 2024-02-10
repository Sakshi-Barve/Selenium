package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class InstagramLoginScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("admin@123");
		driver.findElement(By.name("password")).sendKeys("IDon'tKnow");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		//Explicit Type cast into takescreenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot1/ss2.jpg");
		Files.copy(src, dest);
	}
}
