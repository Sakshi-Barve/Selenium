package assignmentPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3DsgxLY7mz-3MTr19IXsCDxzY-0uRPkjV1-VuIS-bMNvKQOAAAAAQAAAABktkMAcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Foffers%2Fnonprimehomepage%3Fref_%253Ddv_web_force_root&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=261-3316692-2812409&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
	}
}
