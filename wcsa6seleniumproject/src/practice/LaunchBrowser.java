package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {

	WebDriver	driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		//System.out.println(driver.getTitle());
		//Thread.sleep(2000);
		//System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		//System.out.println(driver.getCurrentUrl());
		driver.quit();
		//driver.close();
		
		
	}
}
