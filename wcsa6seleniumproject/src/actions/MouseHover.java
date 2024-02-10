package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
	    WebDriver	driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.bluestone.com/");
	    //handle hidden division popup
	    driver.findElement(By.id("denyBtn")).click();
	    //Identify watch jewellery 
	    WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	    Actions act = new Actions(driver);
	   //without using perform() method
	    //act.moveToElement(target);
	    //using perform method
	    act.moveToElement(target).perform();
	    //click on band option
	    driver.findElement(By.xpath("//a[text()='Band']")).click();
	}
}
