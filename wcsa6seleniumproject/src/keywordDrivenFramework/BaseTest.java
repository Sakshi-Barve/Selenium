package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoContant   {
	

	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		// Read the data from property file to get the Browservalue and url
	   Flib flib = new Flib();
	   String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
	   String url = flib.readPropertyData(PROP_PATH,"Url");
	 
	   if(browserValue.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   driver=new ChromeDriver();
	   }
	   else if(browserValue.equalsIgnoreCase("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   
	   else if(browserValue.equalsIgnoreCase("Edge"))
	   {
		   driver=new EdgeDriver();
	   }
	   else
	   {
		   System.out.println("enter the valid Browser Value!!!");
	   }
	   
	   //maximize the browser
	   driver.manage().window().maximize();
	   // apply implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  //launch the WebApplication
	   driver.get(url);
	   
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
//	public void openBrowser() throws IOException
//	{
//		//read the data from property file to get the Browservalue
//		Flib flib = new Flib();
//		String browserValue = flib.readPropertyData("./data/config.properties", "Browser");
//		String url = flib.readPropertyData("./data/config.properties", "Url");
//		if(browserValue.equalsIgnoreCase("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//			driver= new ChromeDriver();
//		}
//		
//		else if(browserValue.equalsIgnoreCase("firefox"))
//		{
//			driver= new FirefoxDriver();
//		}
//		else if(browserValue.equalsIgnoreCase("edge"))
//		{
//			driver= new EdgeDriver();
//		}
//		
//		else
//		{
//			System.out.println("Please enter valid browser value");
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get(url);
//	}
//	public void closeBrowser()
//	{
//		driver.quit();
//	}
}
