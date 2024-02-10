package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//identify usernametextbox and pass the invalid inputs
		//WebElement UserNameTB = driver.findElement(By.name("username"));
		//UserNameTB.sendKeys("admin123");
		driver.findElement(By.name("username")).sendKeys("admin123");
		
		//identify password text box and pass the valid inputs
		WebElement PasswordTB = driver.findElement(By.name("password"));
		PasswordTB.sendKeys("admin123");
		//identify login button and click
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		Thread.sleep(2000);
		//UserNameTB.clear();
		//UserNameTB.sendKeys("Admin");
		
		//when we are clicking on login button webpage is refreshing and address of webelement is changing at that time we are using old password thatswhy we are getting StaleElementException.
		//to overcome this exception we are using 2nd way By using method chaining
		
		//identify username text box and clear the inputs
		driver.findElement(By.name("username")).clear();
		
	}
}
