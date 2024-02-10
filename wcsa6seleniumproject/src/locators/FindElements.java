package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Poha");
		Thread.sleep(2000);
		List<WebElement> pohasuggestion = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]"));
		for(int i=0; i<pohasuggestion.size(); i++) 
		{
			WebElement element = pohasuggestion.get(i);
			String poha=element.getText();
			Thread.sleep(2000);
			System.out.println(pohasuggestion.get(i).getText());
			//System.out.println(poha);
		}
	}
}
