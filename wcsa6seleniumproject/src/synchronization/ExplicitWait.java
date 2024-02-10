package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//To apply explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
		driver.get("https://www.shoppersstack.com/");
		
		//Take Expectedconditions class
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='electronics']")));
		driver.findElement(By.xpath("//a[@id='electronics']")).click();
		driver.findElement(By.linkText("Laptops ")).click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
		driver.findElement(By.name("Check")).click();
	}
}
