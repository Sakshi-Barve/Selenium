package assignmentPacakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebEle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev/");
		
		//scroll till particular webelement
		//webelement is NEWS text
		
		//identify News Webelement
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		
		Point loc = newsElement.getLocation();
		
		//perform scrolling till newsElement
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//window.scrollBy(x,y)
		
		jse.executeScript("window.scrollBy("+loc.getX()+","+loc.getY()+")");
		
		//Thread.sleep(2000);
		//jse.executeScript("window.scrollBy", args)
		
		//jse.executeScript("");
		
		
	}
}
