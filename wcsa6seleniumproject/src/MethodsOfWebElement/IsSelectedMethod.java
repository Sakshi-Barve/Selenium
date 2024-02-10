package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.name("userLoginId")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys("manager123");
		//it is auto selected that's why isSelected() method return false value
		//driver.findElement(By.xpath("//span[text()='Remember me']")).click();
		//driver.findElement(By.xpath("//input[@id='bxid_rememberMe_true']")).click();
		
		WebElement res = driver.findElement(By.xpath("//input[@id='bxid_rememberMe_true']"));
		boolean res1 = res.isSelected();
		System.out.println(res1);
	}
}
