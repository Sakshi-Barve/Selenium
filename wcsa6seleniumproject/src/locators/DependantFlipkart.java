package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependantFlipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile",Keys.ENTER);
	
	}
}
