package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//identify the login button and get the size of login button means height and width of login button
		Dimension SizeOfLoginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).getSize();
		int heightOfLoginButton = SizeOfLoginButton.getHeight();
		int widthOfLoginButton = SizeOfLoginButton.getWidth();
		System.out.println("Height of login button="+heightOfLoginButton);
		System.out.println("Width of login button="+widthOfLoginButton);
		
	}
}
