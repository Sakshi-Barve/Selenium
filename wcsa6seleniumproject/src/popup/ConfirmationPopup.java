package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement button = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		button.click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText()); 
		al.accept();
		Thread.sleep(2000);
		
		
		
	}
}
