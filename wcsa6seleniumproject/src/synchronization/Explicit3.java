package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit3 {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath()));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='jeans']")).sendKeys("")
	}
}
