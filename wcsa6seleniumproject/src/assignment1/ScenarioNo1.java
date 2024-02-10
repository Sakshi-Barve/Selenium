package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioNo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("barvesakshi20@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
}
