package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectDropDown {
	public static void main(String[] args) {
	 WebDriver	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("file:///C:/Users/barve/OneDrive/Desktop/multipleSelectDropdown.html");
	 driver.findElement(By.name("menu"));
	 
	 
	 
	}
}
