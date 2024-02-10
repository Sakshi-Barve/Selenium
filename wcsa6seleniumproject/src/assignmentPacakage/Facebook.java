package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'inputtext') and (@name='firstname')]")).sendKeys("Admin",Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@class,'input') and (@name='lastname')]")).sendKeys("abcdef",Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@class,'inputtext') and (@name='reg_email__')]")).sendKeys("abcd123@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		driver.findElement(By.xpath("//option[@value='22']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		driver.findElement(By.xpath(""));
		
	}
}
