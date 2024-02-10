package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Rectangle LoginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).getRect();
		int xAxis = LoginButton.getX();
		int yAxis = LoginButton.getY();
		int width = LoginButton.getWidth();
		int height = LoginButton.getHeight();
		System.out.println("x axis distance of login button ="+xAxis);
		System.out.println("y axis distance of login button ="+yAxis);
		System.out.println("Height of Login button="+height);
		System.out.println("Width of login button="+width);
		
	}
}
