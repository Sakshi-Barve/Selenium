package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmUsingGenericMethod extends Flib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Flib flib = new Flib();
		
		String username = flib.readExcel("./data/ActiTimeTestData.xlsx","validcred", 1, 0);
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(username);
		
		String password = flib.readExcel("./data/ActiTimeTestData.xlsx", "validcred", 1, 1);
		WebElement passwordTB = driver.findElement(By.name("password"));
		passwordTB.sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}
}
