package assignmentPacakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.linkText("Drag Position")).click();
		Actions act=new Actions(driver);
		WebElement source1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement source2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement source3 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement source4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement mobileAccessoriesTarget1 = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		WebElement laptopAccessoriesTarget2 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		
		act.dragAndDrop(source1, mobileAccessoriesTarget1).perform();
		act.dragAndDrop(source2, laptopAccessoriesTarget2).perform();
		act.dragAndDrop(source3, mobileAccessoriesTarget1).perform();
		act.dragAndDrop(source4, laptopAccessoriesTarget2).perform();
	}
}
