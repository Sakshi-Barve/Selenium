package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-uia='login-submit-button']")).click();
		Thread.sleep(2000);
		
		
	}
}
