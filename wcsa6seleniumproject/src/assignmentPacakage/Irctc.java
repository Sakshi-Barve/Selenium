package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")).sendKeys("Pune", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' PUNE JN - PUNE ']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@fdprocessedid='emdxye']")).sendKeys("Delhi");
	}
}
