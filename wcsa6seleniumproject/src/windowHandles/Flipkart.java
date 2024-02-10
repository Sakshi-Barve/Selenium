package windowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung galaxy s23",Keys.ENTER);
		String add = driver.getWindowHandle();
		Set<String> add1 = driver.getWindowHandles();
		for(String i:add1)
		{
			if(!add.equals(i))
			{
				driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G Smartphone (Phantom Black, 256 GB)']")).click();
			}
		}
		//driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G Smartphone (Phantom Black, 256 GB)']")).click();
	}
}
