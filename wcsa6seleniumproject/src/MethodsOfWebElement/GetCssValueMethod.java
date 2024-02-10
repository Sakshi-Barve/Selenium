package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser by upcasting into webDriver
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //launch the webApplication 
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //Identify the login button and check the css property of webelement like colour, font, height and width
	    String Cssvalue = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("height");
	    System.out.println(Cssvalue);
	    String CssValue2 = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("color");
	    System.out.println(CssValue2);
	    String CssValue3 = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("font");
	    System.out.println(CssValue3);
	}
}
