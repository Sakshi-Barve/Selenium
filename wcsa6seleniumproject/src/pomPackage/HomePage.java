package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[.='Time-Track']/ancestor::a") private WebElement Time_Track_Module;
	@FindBy(xpath = "//div[.='Tasks']/ancestor::a") private WebElement Tasks_Module;
	@FindBy(xpath = "//div[.='Reports']/ancestor::a") private WebElement Reports_Module;
	@FindBy(xpath = "//div[.='Users']/ancestor::a") private WebElement Users_Module;
	@FindBy(xpath = "//div[.='Work Schedule']/ancestor::a") private WebElement Work_Schedule_Module;
	@FindBy(xpath="//div[.='Settings']/ancestor::a") private WebElement Settings_Module;
	@FindBy(partialLinkText = "Logout") private WebElement Logout_Link;
	
	
	
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver , this);
	}
	
	
	
	
	//Utilization
	
	public WebElement getTime_Track_Module() {
		return Time_Track_Module;
	}
	public WebElement getTasks_Module() {
		return Tasks_Module;
	}
	public WebElement getReports_Module() {
		return Reports_Module;
	}
	public WebElement getUsers_Module() {
		return Users_Module;
	}
	public WebElement getWork_Schedule_Module() {
		return Work_Schedule_Module;
	}
	public WebElement getSettings_Module() {
		return Settings_Module;
	}
	public WebElement getLogout_Link() {
		return Logout_Link;
	}
	
	
	
}
