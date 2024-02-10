package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[text()='Time-Track']/ancestor::a") private WebElement Time_Track_Module;
	@FindBy(xpath = "//div[text()='Tasks']/ancestor::a") private WebElement Tasks_Module;
	@FindBy(xpath = "//div[text()='Reports']/ancestor::a") private WebElement Reports_Module;
	@FindBy(xpath = "//div[text()='Users']/ancestor::a") private WebElement Users_Module;
	@FindBy(xpath = "//div[text()='Work Schedule']/ancestor::a") private WebElement WorkSchedule_Module;
	@FindBy(xpath = "//div[text()='Settings']/ancestor::a")private WebElement Settings_Module;
	@FindBy(linkText = "Logout") private WebElement LogoutLink;
	
	HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

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

	public WebElement getWorkSchedule_Module() {
		return WorkSchedule_Module;
	}

	public WebElement getSettings_Module() {
		return Settings_Module;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	
	
	
	//operational
	public void click_on_Time_Track_Module()
	{
		Time_Track_Module.click();
	}
	
	public void click_on_Tasks_Module()
	{
		Tasks_Module.click();
	}

	public void click_on_Reports_Module()
	{
		Reports_Module.click();
	}
	
	public void click_on_Users_Module()
	{
       Users_Module.click();		
	}
	
	public void click_on_Workshedule_Module()
	{
		WorkSchedule_Module.click();
	}
	
	public void click_on_Settings_Module() 
	{
		Settings_Module.click();
	}
	
	public void click_on_Logout_Link()
	{
		LogoutLink.click();
	}

	
	
}
