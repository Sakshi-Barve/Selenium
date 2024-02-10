package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("Admin2123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("admin@12");
		Thread.sleep(2000);
		
		//not running
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		Thread.sleep(2000);
	}
}
