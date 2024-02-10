package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.name("userLoginId")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys("manager123");
		WebElement result = driver.findElement(By.name("password"));
		boolean result1 = result.isDisplayed();
		System.out.println(result1);
		WebElement res = driver.findElement(By.xpath("//span[text()='Remember me']"));
		boolean res1 = res.isDisplayed();
		System.out.println(res1);
		
	}
}
