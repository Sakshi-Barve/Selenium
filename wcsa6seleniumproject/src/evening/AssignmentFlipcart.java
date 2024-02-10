package evening;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFlipcart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select sel1=new Select(dayDropdown);
		Select sel2= new Select(monthDropdown);
		Select sel3= new Select(yearDropdown);
		//day dropdown is multiple or not
		System.out.println("Day dropdown is multiple: "+sel1.isMultiple());
		//Month dropdown is multiple or not
		System.out.println("month dropdown is multiple: "+sel2.isMultiple());
		//Year dropdown is multiple or not
		System.out.println("year dropdown is multiple: "+sel3.isMultiple());
		List<WebElement> dayOptions = sel1.getOptions();
		System.out.println("Day options:");
		for(WebElement ele:dayOptions) 
		{
			
			System.out.println(ele.getText());
		}
		
		List<WebElement> monthOptions = sel2.getOptions();
		System.out.println("Month Options:");
		for(WebElement ele:monthOptions)
		{
			System.out.println(ele.getText());
		}
		
		List<WebElement> yearOptions = sel3.getOptions();
		System.out.println("Year Options:");
		for(WebElement ele: yearOptions)
		{
			System.out.println(ele.getText());
		}
		sel1.selectByValue("17");
		sel2.selectByIndex(10);
		sel3.selectByValue("2003");
		
	}
}
