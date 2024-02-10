package robotClass;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintPage {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		//to print the page we need to press ctrl+P
		Robot robot = new Robot();
		//to press the ctrl
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		//to press the P
		robot.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		//to release the ctrl
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//to release the P
		robot.keyRelease(KeyEvent.VK_P);
		Thread.sleep(2000);
		//to switch the control to cancel press tab button
		//to press the tab button
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		//to release the tab button
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		//to press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//To release the enter 
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//---------------------------------------------
		//To click on Getting started
		
		driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		
		Thread.sleep(2000);
		//To perform right click action 
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		act.contextClick(target).perform();
		Thread.sleep(2000);
		for(int i=1; i<=10; i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			Thread.sleep(2000);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
