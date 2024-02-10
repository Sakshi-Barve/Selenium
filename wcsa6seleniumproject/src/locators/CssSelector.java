//cssselector :- tagname[attributeName='attributeValue']
// $-Match only the ending character
// *- Match any character
// ^- Match starting characters
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='userLoginId']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin1234");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
