package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//if u are using shopper stack like website u need to give 60 second or more than 60 second implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		//click on any product
		driver.findElement(By.cssSelector("img[alt='jeans']")).click();
		//identify box of pincode
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		//click on check box
		driver.findElement(By.id("Check")).click();
		//it will through exception because implicit wait only works for findelement and findelements mw=ethods . it will not click the webelement because click method is method of WebElement .
	}
}
