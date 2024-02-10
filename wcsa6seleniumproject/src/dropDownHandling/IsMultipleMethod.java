package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//check whether the dropdown is single select or multiselect by using isMultiple() method.
		//If dropDown is multi select then it will return true ifsingle select it will return false
		driver.get("file:///C:/Users/barve/OneDrive/Documents/singleDropdown.html");
		WebElement dropDownEle = driver.findElement(By.id("i1"));
		Select sel=new Select(dropDownEle);
		System.out.println(sel.isMultiple());
		
	}
}
