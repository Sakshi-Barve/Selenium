package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_5_7b")).click();
		Thread.sleep(2000);
		
	}
}
