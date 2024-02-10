package evening;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateEleFromDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/barve/OneDrive/Desktop/multipleSelectDropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropdownEle = driver.findElement(By.id("menu"));
		Select sel= new Select(dropdownEle);
		List<WebElement> ops = sel.getOptions();
		HashSet<String> hs= new HashSet<String>();
		for(WebElement ele:ops) {
			String options = ele.getText();
			hs.add(options);
			
			
			
		}
		System.out.println(hs);
		
	}
}
