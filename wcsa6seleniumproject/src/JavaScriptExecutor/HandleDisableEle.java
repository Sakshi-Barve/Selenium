package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableEle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/barve/OneDrive/Desktop/WebElement(HTML)/DisableTextBox.html");
		
		//identify username textbox
		WebElement USN = driver.findElement(By.id("id1"));
		USN.sendKeys("Admin");
		Thread.sleep(5000);
		
		//Handle Disable webelement
		//Explicit Type cast into JavascriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('id2').value='manager';");
	}
}
