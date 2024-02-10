package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("uploadfile")).click();
		//Handle Window Based popup
		File file = new File("./AutoitFiles/UploadFile.exe");
		String abs = file.getAbsolutePath();
		Runtime.getRuntime().exec(abs);
	}
}
