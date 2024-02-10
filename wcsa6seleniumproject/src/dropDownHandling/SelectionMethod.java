package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	//static dropdown
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/barve/OneDrive/Documents/singleDropdown.html");
		// handle dropdown by using Select class..
		// Identify dropDown
		// single select
		WebElement dropDownEle = driver.findElement(By.id("i1"));

		// create the obj of Select class to access methods..

		Select ele = new Select(dropDownEle);

		// use selection methods
		Thread.sleep(4000);
		// selected option according to index value
		// ele.selectByIndex(4);
		// select multiple options by using for loop
		for (int i = 0; i <= 3; i++) {
			ele.selectByIndex(i);
			Thread.sleep(4000);
		}
		Thread.sleep(4000);

		// selected option according to visible text
		// ele.selectByVisibleText("chiwda");
		Thread.sleep(4000);
		// selected option according to value
//			 ele
	}
}
