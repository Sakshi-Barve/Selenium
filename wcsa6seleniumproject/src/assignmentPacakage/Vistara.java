package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Vistara {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//handle notification popup
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		//launch web application
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/flights/en-in/");
		driver.findElement(By.xpath("//input[contains(@class, 'w-full focus:outline') and (@id='flights-booking-id-1-input')]")).sendKeys("Pune",Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class=' css-0' and (text()='Pune (PNQ)') ]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='flights-booking-id-2-input']")).sendKeys("Delhi", Keys.ENTER);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[contains(@class, ' css-0') and (text()='Delhi (DEL)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Departure']")).click();
		Thread.sleep(2000);
		//click left of the calender
		driver.findElement(By.xpath("//button[text()='keyboard_arrow_left']")).click();
		Thread.sleep(2000);
		//departure date
		driver.findElement(By.xpath("(//div[contains(@class,'flex flex-wrap items-center justify-center flex-nowrap flex-grow css-qu0ty4') and (text()='30')])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@data-att='day-2023-08-17' and (text()='17')]/ancestor::div[@aria-label='Thursday, August 17, 2023' and (@tabindex='-1')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-att='day-2023-08-17' and (text()='17')]")).click();
		Thread.sleep(2000);
		//return calender date
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(6000);
		driver.quit();
		
	}
}
