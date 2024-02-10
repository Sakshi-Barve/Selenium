package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		//click on google apps
		WebElement apps = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		apps.click();
		//
		WebElement map = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(map);
		//find maps 
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
	}
}
