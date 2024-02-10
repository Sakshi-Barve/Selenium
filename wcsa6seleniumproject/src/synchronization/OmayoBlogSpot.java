package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoBlogSpot {
	public static void main(String[] args) {
		//Until methods 
		//elementTobeClickable
		//titleContains
		//FasibilityOfElement
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement ele = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		driver.findElement(By.linkText("Flipkart")).click();
	}
}
