package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://semantic-ui.com/modules/dropdown.html#dropdown");
		//find the dropdown webElement on webpage
		WebElement dropDownEle = driver.findElement(By.xpath(""));
		//identify multiple dropdown webelement
	    Select ele = new Select(dropDownEle);
		for(int i=0; i<6; i++)
		{
			Thread.sleep(2000);
			ele.selectByIndex(i);
		}
		
	}
}
