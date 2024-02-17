package popupHandling2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("alert1")).click();
		
		//we cannot create object of alert because it is interface
		Alert al = driver.switchTo().alert();
		//al.accept();
		
		//al.dismiss();
		//To get the text of alert popup
		System.out.println(al.getText());
		//driver.close();
	}
}
