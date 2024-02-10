package assignmentPacakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		Actions act=new Actions(driver);
		WebElement yesButton = driver.findElement(By.id("btn20"));
		act.doubleClick(yesButton).perform();
		
		WebElement noButton = driver.findElement(By.id("btn23"));
		act.doubleClick(noButton).perform();
		
		WebElement button_5 = driver.findElement(By.id("btn28"));
		act.doubleClick(button_5).perform();
		
	}
}
