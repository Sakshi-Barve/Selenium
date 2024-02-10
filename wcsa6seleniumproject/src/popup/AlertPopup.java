package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/barve/OneDrive/Desktop/WebElement(HTML)/AlertPopup.html");
		WebElement button = driver.findElement(By.xpath("//button[text()='Click me!']"));
		button.click();
		//handle Alert popup by using switchTo()
		Alert al = driver.switchTo().alert();
		al.accept();
		driver.close();
	}
}
