package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {
	public static void main(String[] args) {
		//ROseWMCS
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//Identify the webElement which has to drag
		WebElement src1 = driver.findElement(By.id("box1"));//oslo
		WebElement src2 = driver.findElement(By.id("box2"));//Stockholm
		WebElement src3 = driver.findElement(By.id("box3"));//washington
		WebElement src4 = driver.findElement(By.id("box4"));//copenhegan
		WebElement src5 = driver.findElement(By.id("box5"));//seol
		WebElement src6 = driver.findElement(By.id("box6"));//rome
		WebElement src7 = driver.findElement(By.id("box7"));//Madrid
		//----------------------------------------------------------------------------------------
		
		//Identify the webelement which has to drop
		WebElement target1 = driver.findElement(By.id("box106"));
		WebElement target2 =driver.findElement(By.id("box101"));
		WebElement target3 =driver.findElement(By.id("box105"));
		WebElement target4 =driver.findElement(By.id("box103"));
		WebElement target5 =driver.findElement(By.id("box107"));
		WebElement target6 =driver.findElement(By.id("box104"));
		WebElement target7 =driver.findElement(By.id("box102"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src6, target1).perform();
		act.dragAndDrop(src1, target2).perform();
		act.dragAndDrop(src5, target3).perform();
		act.dragAndDrop(src3, target4).perform();
		act.dragAndDrop(src7, target5).perform();
		act.dragAndDrop(src4, target6).perform();
		act.dragAndDrop(src2, target7).perform();
		
	}
}
