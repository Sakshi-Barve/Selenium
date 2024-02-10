package dropDownHandling;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvalue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/barve/OneDrive/Documents/singleDropdown.html");
		WebElement dropDownEle = driver.findElement(By.id("i1"));
		
		Select sel = new Select(dropDownEle);
		String [] arr= {"v1","v2","v3","v4","v5","v6","v7","v8","v9"};
		for(int i=0; i<arr.length; i++)
		{
			Thread.sleep(2000);
			sel.selectByValue(arr[i]);
		}
		
		
	}
}
