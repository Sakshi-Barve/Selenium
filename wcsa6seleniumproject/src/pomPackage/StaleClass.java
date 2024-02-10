package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=23j8eh31pofmm");
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		System.out.println(usnTB);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		usnTB.sendKeys("admin123");
	}
}
