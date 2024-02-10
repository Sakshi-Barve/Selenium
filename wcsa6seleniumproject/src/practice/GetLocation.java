package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 
	 driver.get("https://www.instagram.com/");
	 WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));
	 Point l1 = login.getLocation();
	 
	 System.out.println(l1.getX());
	 System.out.println(l1.getY());
	 
	}
}
