package assignmentOnGetwindowmethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		String Parent = driver.getWindowHandle();
		WebElement childBrow = driver.findElement(By.linkText("Open a popup window"));
		childBrow.click();
		Set<String> AllHandle = driver.getWindowHandles();
		for(String Wh:AllHandle)
		{
			//close the browser by switch the address of window
			Thread.sleep(2000);
			if(!Parent.equals(Wh))
			{
				driver.switchTo().window(Wh);
				driver.manage().window().maximize();
			}
		}
	}
}
