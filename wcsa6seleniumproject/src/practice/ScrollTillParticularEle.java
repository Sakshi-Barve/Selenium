package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularEle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev/");
		//scroll till particular element
		//scroll till NEWS  webelement
		WebElement News = driver.findElement(By.xpath("//h2[text()='News']"));
		Point loc = News.getLocation();
		
		//Explicit Type cast into JAvScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//window.scrollBy(x, y)
		//It will scroll below News Webelement
		//jse.executeScript("window.scrollBy("+loc.getX()+","+loc.getY()+")");
		
		//It will scroll till the particular webelement(NEWS)
		jse.executeScript("window.scrollBy("+loc.getX()+","+(loc.getY()-90)+")");
		
		
	}
}
