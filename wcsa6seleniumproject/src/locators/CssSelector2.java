//cssselector will not work for text()
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("button[type*='sub']")).click();
		//driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin@123");
		// $:- Ending characters
		//driver.findElement(By.cssSelector("input[name$='me']")).sendKeys("Admin@123");
		//* :- Any Character
		//driver.findElement(By.cssSelector("input[name*='ser']")).sendKeys("Admin@123");
		//^ :- Starting CHaracters
		driver.findElement(By.cssSelector("input[name^='us']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		
		
	}
}
