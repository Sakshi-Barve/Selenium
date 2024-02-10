package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		Thread.sleep(3000);
		button.click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);
	}
}
