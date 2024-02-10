package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia {
		public static void main(String[] args) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			WebDriver driver= new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			//driver.findElement(By.xpath("//div[text()='PNQ']")).click();
			//driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']")).sendKeys("Pune");
			//driver.findElement(By.xpath("//div[text()='COK']")).click();
			//driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']")).sendKeys("Kochi");
		}
}
