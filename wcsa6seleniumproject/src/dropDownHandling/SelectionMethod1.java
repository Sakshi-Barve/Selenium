package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod1 {
	//static method
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the webApplication
		driver.get("file:///C:/Users/barve/OneDrive/Documents/singleDropdown.html");
		
		//handle dropdown by using Select class 
		//Identify dropdown (dropdown is webElement so find the dropdown by using findElement())
		WebElement dropdown = driver.findElement(By.id("i1"));
		
		//to access the Select class methods we need to create object because methods of select class are non-static
		Select ele = new Select(dropdown);
		
		//select the option according to index value
		//ele.selectByIndex(4);
		
		//select multiple options by using for loop
		for(int i=0; i<=5; i++)
		{
			ele.selectByIndex(i);
			Thread.sleep(4000);
			
		}
	}
}
