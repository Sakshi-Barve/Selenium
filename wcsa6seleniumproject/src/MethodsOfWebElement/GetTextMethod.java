package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser and upcast into webDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the webapplication
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Identify the login button and get the text of the login button
		String textOfLoginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).getText();
		System.out.println(textOfLoginButton);
	}
}

 