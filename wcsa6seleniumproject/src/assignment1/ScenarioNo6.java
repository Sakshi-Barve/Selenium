package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import qsp.Action;

public class ScenarioNo6 {
	 public static void main(String[] args) throws InterruptedException {
		 	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.navigate().to("https://www.bluestone.com/");
			driver.findElement(By.id("denyBtn")).click();
			WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.moveToElement(target).perform();
			driver.findElement(By.xpath("//a[@title='Diamond Rings' and text()='Diamond']")).click();
	}
}
