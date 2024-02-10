package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	LoginPage lp= new LoginPage(driver);
	driver.get("http://127.0.0.1/login.do;jsessionid=1k3kragrcjte0");
    Thread.sleep(2000);
    lp.invalidLogin("admin12", "manager");
    Thread.sleep(2000);
    lp.invalidLogin("admin@12", "manager");
    
}
}
