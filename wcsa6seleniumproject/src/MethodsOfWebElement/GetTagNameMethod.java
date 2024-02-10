package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser for that create object and upcast into webdriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		//launch the web application
		driver.get("https://www.instagram.com/");
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		String result = button.getTagName();
		System.out.println(result);
	}
}
