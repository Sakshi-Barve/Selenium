package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		//click on any product
		driver.findElement(By.cssSelector("img[alt='jeans']")).click();
		//identify box of pincode
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		//click on check box
	    
		
		WebElement checkButton=	driver.findElement(By.id("Check"));
		explicitWait(driver,80,checkButton).click();
		//To apply explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();
				
	}
	public static WebElement explicitWait(WebDriver driver, int sec, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement el= wait.until(ExpectedConditions.elementToBeClickable(ele));
		return el;
		
	}
}
