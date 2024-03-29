package popupHandling2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("confirm")).click();
		Alert confirmationPopup = driver.switchTo().alert();
		//confirmationPopup.accept();
		System.out.println(confirmationPopup.getText());
		confirmationPopup.dismiss();
		
		//driver.close();
	}
}
