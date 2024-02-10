package dropDownHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectTreeSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
	 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("file:///C:/Users/barve/OneDrive/Desktop/multipleSelectDropdown.html");
	  WebElement dropDownEle = driver.findElement(By.name("menu"));
	  
	  //handle the dropdown
	  Select sel=new Select(dropDownEle);
	  
	  //remove duplicates from dropdown by using treeset
	  TreeSet<String> ts= new TreeSet<String>();
	  
	  //read the options from dropDown 
	  List<WebElement> allOpt = sel.getOptions();
	  
	  //read the options
	  for(int i=0; i<allOpt.size(); i++)
	  {
		  //read the text of all options
		  Thread.sleep(2000);
		  String text = allOpt.get(i).getText();
		  
		  //add text into treeset  and maintain insertion order
		  ts.add(text);
	  }
	  Thread.sleep(2000);
	  
	  //read the options from treeset
	  
	  for(String opt:ts)
	  {
		  Thread.sleep(2000);
		  System.out.println(opt);
	  }
	 
	}
}
