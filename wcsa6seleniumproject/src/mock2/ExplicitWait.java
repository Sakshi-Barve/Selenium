package mock2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    driver.get("https://www.shoppersstack.com/");
	    driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
	    driver.findElement(By.id("Check Delivery")).sendKeys("411033");
	    
	    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
//	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Check"))));
//	    driver.findElement(By.id("Check")).click();
//	    
	    WebElement checkButton = driver.findElement(By.id("Check"));
	    wait.until(ExpectedConditions.elementToBeClickable(checkButton)).click();
	    
	}

}
