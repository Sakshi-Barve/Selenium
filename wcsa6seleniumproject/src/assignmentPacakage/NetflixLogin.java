package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("admin");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.close();
	}
}
