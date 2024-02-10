package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//read the value from sheet
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcred");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		
		Cell cell1 = row.getCell(1);
		String pwd = cell1.getStringCellValue();
		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
