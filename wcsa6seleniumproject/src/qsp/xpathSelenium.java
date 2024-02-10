package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		//driver.findElement(By.xpath("//p[text()='Java']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='card-title fw-bold h6' and (text()='Java') or (@class='card-title fw-bold h6') and (text()='Python')]"));
		Thread.sleep(2000);
	}
}
