package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(10000);
		driver.close();
		
		
		
	}
}
