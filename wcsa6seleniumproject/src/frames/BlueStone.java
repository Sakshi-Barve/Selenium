package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		//
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//To handle webelement of frame we need to switch control to that particular frame
		//to switch control there are 3 ways
		
		//way 1 
		//This chat box is design under frame
		//Handle Frame first by identifying it
		//driver.switchTo().frame(3); //we handle frame By using index
		//driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
		
		//------------------------------------------------------------
		//way 2
		WebElement FrameEle = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(FrameEle);
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
	}
}
