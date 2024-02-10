package assignmentPacakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHouver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//div[@class='_1ch8e_' and @aria-label='Home & Furniture']"));
		act.moveToElement(target).perform();
		act.contextClick(target).perform();
		
	}
}
