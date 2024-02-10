package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
		//launch the browser and upcast into webDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //launch the webapplication
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    //Identify the login button and get the location of login button 
	    //location means xaxis and yaxis in pixel
	    Point loginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).getLocation();
	    //getX() is returnning integer value because pixel is in integer value
	    int xAxis = loginButton.getX();
	    int yAxis = loginButton.getY();
	    System.out.println("location of login button from x axis="+xAxis);
	    System.out.println("Location of login button from y axix="+yAxis);
	}
}
