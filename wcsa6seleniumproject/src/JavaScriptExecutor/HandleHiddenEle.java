package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class HandleHiddenEle {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		WebElement readMore = driver.findElement(By.xpath("//a[contains( @class, 'selenium-button selenium-gr')]"));
		Thread.sleep(5000);
		//explicit type cast into java scriptexecture
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", readMore);
		driver.close();
		
	}
}
