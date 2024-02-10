package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectionMethodException {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/barve/OneDrive/Documents/singleDropdown.html");
		WebElement dropDownEle = driver.findElement(By.id("i1"));
		Thread.sleep(2000);
		Select sel = new Select(dropDownEle);
		sel.selectByIndex(3);
		
		//sel.deselectByIndex(3);
		
		
		//select multiple options and deselect 
		for(int i=0; i<5; i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		
		for(int i=0; i<4; i++)
		{
			Thread.sleep(2000);
			sel.deselectByIndex(i);
		}
	}
}
