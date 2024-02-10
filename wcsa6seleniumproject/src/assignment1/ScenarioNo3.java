package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScenarioNo3 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.switchTo().frame(driver, )
		driver.get("https://jqueryui.com/droppable/");
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
	}
}
