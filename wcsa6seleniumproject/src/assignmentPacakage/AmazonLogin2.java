package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//on instagram identify webelement by using name locator
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.instagram.com/");
		Thread.sleep(2000);
         driver.findElement(By.name("username")).sendKeys("prati@123");
         Thread.sleep(2000);
         driver.findElement(By.name("password")).sendKeys("12345");
         
	}

}
