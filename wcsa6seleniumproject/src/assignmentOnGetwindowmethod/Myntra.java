package assignmentOnGetwindowmethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//handle notification popup
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");			
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com");			
		//get the address of parent window
		String Parent = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Shoes",Keys.ENTER);
		//click on the 1st shoes
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		
		//get the address of allhandles
		Set<String> allHandle = driver.getWindowHandles();
		for(String wh:allHandle)
		{
			if(!Parent.equals(wh))
			{
				driver.switchTo().window(wh);
				
			}
		}
		
		//click on size
		driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and (text()='6')]")).click();
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'itemComponents-base-selection')]")).click();
		
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		
		driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton ' and text()='REMOVE']")).click();
		
//		driver.findElement(By.xpath("//div[contains(@class, 'inlinebuttonV2-base-action bulkActionStrip-desktopActionButton')]")).click();
//		driver.findElement(By.xpath("//button[contains(@class, 'inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkR')]")).click();
	}
}
