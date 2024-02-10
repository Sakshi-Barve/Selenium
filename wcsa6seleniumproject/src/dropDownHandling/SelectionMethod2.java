package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod2 {
	//static dropdown
	//select option according to value
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/barve/OneDrive/Documents/singleDropdown.html");
		
		//Identify dropdown using findElement()
		WebElement dropdown = driver.findElement(By.id("i1"));
		
		//to access the methods of select class create an object
		Select ele = new Select(dropdown);
		
	}
}
