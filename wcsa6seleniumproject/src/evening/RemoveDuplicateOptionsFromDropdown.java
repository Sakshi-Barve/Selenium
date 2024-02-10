package evening;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateOptionsFromDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver	driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("file:///C:/Users/barve/OneDrive/Desktop/multipleSelectDropdown.html");
	     WebElement dropdownEle = driver.findElement(By.id("menu"));
	     Select sel= new Select(dropdownEle);
	     List<WebElement> ops = sel.getOptions();
	     TreeSet<String> ts= new TreeSet<String>();
	     for(WebElement ele: ops) 
	     {
	    	 String options = ele.getText();
	    	 ts.add(options);
	     }
	     System.out.println(ts);
	     
	}
}
