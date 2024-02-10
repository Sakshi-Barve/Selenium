package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		if(driver.getTitle().equals("OrangeHRM"))
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		if(driver.getTitle().equals("OrangeHRM"))
		{
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.xpath("//a[@class='oxd-userdropdown-link' and (text()='Logout')]")).click();
		}
		
	}
}
