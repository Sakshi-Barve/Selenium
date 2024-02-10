package assignmentPacakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://scratch.mit.edu/projects/editor/?tutorial=getStarted");
			driver.findElement(By.xpath("//div[@class='card_remove-button_1F8SI']")).click();
			
			
	}
}
