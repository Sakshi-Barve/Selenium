package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the web application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Identify the username text box and get the attributevalue
		String AttributeName = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("class");
		System.out.println("Attribute value of username text box="+AttributeName);
	}
}
