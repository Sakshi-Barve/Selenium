package assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScenarioNo4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.com/");
		//Search for apple watches 
		driver.findElement(By.id("gh-ac")).sendKeys("Apple Watches");
		//Identify dropdown
		WebElement dropDownEle = driver.findElement(By.id("gh-cat"));
		//create object of select class to perform the actions on dropdown
		Select sel = new Select(dropDownEle);
		//select by value i.e. jewellery and watch
		sel.selectByValue("281");
		//click on search button
		driver.findElement(By.id("gh-btn")).click();
		
		//To print the result of apple watch
		List<WebElement> resProduct = driver.findElements(By.xpath("//div[contains(@class,'s-item__title')]"));
			for(int i=0; i<resProduct.size(); i++)
			{
				WebElement ele = resProduct.get(i);
				String res = ele.getText();
				System.out.println(resProduct.get(i).getText());
			}
			
		//
	}
}

