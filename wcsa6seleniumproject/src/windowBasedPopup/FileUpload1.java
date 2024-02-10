package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@id='uploadfile' and (@name='anyfile')]"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		jse.executeScript("window.scrollBy(0,1000)");
		ele.click();
		File file = new File("./AutoitFiles/UploadFile.exe");
		String abs = file.getAbsolutePath();
		Runtime.getRuntime().exec(abs);
	}
}
