package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidCredOrangeHRMTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Flib flib = new Flib();
		for(int i = 1; i<=9; i++)
		{
			String username = flib.readExcel("./data/ActiTimeTestData.xlsx", "invalidcred1", i, 0);
			String password = flib.readExcel("./data/ActiTimeTestData.xlsx", "invalidcred1", i, 1);
			WebElement usnTB = driver.findElement(By.name("username"));
			usnTB.sendKeys(username);
			
			WebElement passwordTB = driver.findElement(By.name("password"));
			passwordTB.sendKeys(password);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		Thread.sleep(2000);
		
	}
}
