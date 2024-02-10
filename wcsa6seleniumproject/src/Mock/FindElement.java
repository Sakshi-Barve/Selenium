package Mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement ele = driver.switchTo().activeElement();
		List<WebElement> bikeOptions = ele.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(int i=0; i<bikeOptions.size(); i++)
		{
			String ops = bikeOptions.get(i).getText();
			System.out.println(ops);
			Thread.sleep(2000);
		}
		
	}

}
