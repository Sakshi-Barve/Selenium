package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPdf {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		
		File f1 = new File("./AutoitFiles/PdfFileUpload.exe");
		String abs = f1.getAbsolutePath();
		Runtime.getRuntime().exec(abs);
		
	}
}
