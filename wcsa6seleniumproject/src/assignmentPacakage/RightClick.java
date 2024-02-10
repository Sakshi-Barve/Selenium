package assignmentPacakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		WebElement rightClickButton1 = driver.findElement(By.id("btn30"));
		Actions act = new Actions(driver);
		act.contextClick(rightClickButton1).perform();
		WebElement yesButton = driver.findElement(By.xpath("//div[text()='Yes']"));
		yesButton.click();
		
		WebElement rightClickButton2 = driver.findElement(By.id("btn31"));
		act.contextClick(rightClickButton2).perform();
		WebElement noButton = driver.findElement(By.xpath("//div[text()='No']"));
		noButton.click();
		
		WebElement rightClickButton3 = driver.findElement(By.id("btn32"));
		act.contextClick(rightClickButton3).perform();
		WebElement button = driver.findElement(By.xpath("//div[text()='5']"));
		button.click(); 
		
	}

}
