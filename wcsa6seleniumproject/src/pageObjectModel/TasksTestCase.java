package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksTestCase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		LoginPage lp= new LoginPage(driver);
		driver.get("http://127.0.0.1/login.do;jsessionid=1k3kragrcjte0");
        Thread.sleep(2000);
		lp.validLogin("admin", "manager");
		
		HomePage hp= new HomePage(driver);
		hp.click_on_Tasks_Module();
		
		TasksPage tp=new TasksPage(driver);
		tp.create_New_Customer("City Bank Online1");
		tp.create_New_Project("City Bank Online1","web Application");
		tp.deleteCust_ProjectMethod();
		
	}
}
