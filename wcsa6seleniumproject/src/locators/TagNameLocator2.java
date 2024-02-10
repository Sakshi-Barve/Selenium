package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\barve\\OneDrive\\Desktop\\WebElement(HTML)\\TextBoxhtml.html");
		Thread.sleep(2000);
		// identify username textbox by using tag name locator
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		// identify username textbox by using tag name locator
		driver.findElement(By.tagName("input")).sendKeys("manager");

	}

}
