package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitUsingMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
	}
}
