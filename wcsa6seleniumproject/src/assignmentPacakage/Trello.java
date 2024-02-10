package assignmentPacakage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Trello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://trello.com/home");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("sakshibarve43@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		//driver.navigate().to("https://id.atlassian.com/login?application=trello&continue=https%3A%2F%2Ftrello.com%2Fauth%2Fatlassian%2Fcallback%3FreturnUrl%3D%252F%26display%3DeyJ2ZXJpZmljYXRpb25TdHJhdGVneSI6InNvZnQifQ%253D%253D%26aaOnboarding%3D%26updateEmail%3D%26traceId%3D65c45a0e79bdf3352bca5b08c9291914%26ssoVerified%3D%26createMember%3Dfalse&display=eyJ2ZXJpZmljYXRpb25TdHJhdGVneSI6InNvZnQifQ%3D%3D&email=sakshibarve43%40gmail.com&login_hint=sakshibarve43%40gmail.com&restrict=true");
		driver.findElement(By.name("password")).sendKeys("Sakshi#Barve@123");
		driver.findElement(By.id("login-submit")).click();
		
		Actions act= new Actions(driver);
		driver.findElement(By.xpath("//div[@title='E1']")).click();
		WebElement sourceJava = driver.findElement(By.linkText("JAVA"));
		WebElement sourceManual = driver.findElement(By.linkText("Manual Testing"));
		WebElement sourceApi= driver.findElement(By.linkText("API"));
		WebElement sourceSelenium= driver.findElement(By.linkText("Selenium"));
		
		WebElement targetMockGiven = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
		WebElement targetMockPending = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
		WebElement targetMockScheduled = driver.findElement(By.xpath("//h2[text()='Mock Scheduled']"));
		
		act.contextClick(sourceJava).perform();
		List<WebElement> ops = driver.findElements(By.xpath("//button[contains(@class, 'Bpp')]"));
		for(WebElement ele: ops)
		{
			String options = ele.getText();
			System.out.println(options);
		}
		Thread.sleep(2000);
		act.dragAndDrop(driver.findElement(By.linkText("JAVA")), driver.findElement(By.xpath("//h2[text()='Mock Given']"))).perform();
		act.dragAndDrop(driver.findElement(By.linkText("Manual Testing")), targetMockGiven).perform();
		act.dragAndDrop(driver.findElement(By.linkText("Selenium")), targetMockScheduled).perform();
		act.dragAndDrop(driver.findElement(By.linkText("API")), targetMockPending).perform();
	}

}
