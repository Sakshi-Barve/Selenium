package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='_2d0we9']/descendant::div[text()='Core i5']")).click();
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
	}
}
