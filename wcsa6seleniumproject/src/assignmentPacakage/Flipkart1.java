package assignmentPacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//cancel the login popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//search for laptop
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("laptop", Keys.ENTER);
		Thread.sleep(2000);
		//click on processor
		driver.findElement(By.xpath("(//div[@class='_4921Z t0pPfW'])[1]")).click();
		//click on Brand
		//driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='_3879cV' and text()='HP']")).click();
		//click on OS
/*		driver.findElement(By.xpath(""));
		Thread.sleep(2000);
		driver.findElement(By.xpath(""));
		Thread.sleep(2000);
		//identify all the suggestions of laptop
		List<WebElement> allsuggestions = driver.findElements(By.xpath(""));
*/		
	}
}
