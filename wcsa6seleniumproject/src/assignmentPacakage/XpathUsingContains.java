package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class XpathUsingContains {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).sendKeys("Puma shoes",Keys.ENTER);
			driver.findElement(By.xpath("//a[contains(text(),'Carina 2.0 Logo Power Casuals For Women')]")).click();
		}
}
