package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(name = "pwd") private WebElement passTB;
	@FindBy(id = "keepLoggedInCheckBox") private WebElement keepMeLoggedIn;
	@FindBy(id = "loginButton") private WebElement loginButton;
	@FindBy(linkText = "Actimind Inc.") private WebElement actiMind;
	@FindBy(id = "licenseLink") private WebElement licenseLink;
	
//	public LoginPage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		//to initialize we are using init() method of PageFactory class and this keyword is used to point the current object
//		PageFactory.initElements(driver, this);
//	}

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public void setUsnTB(WebElement usnTB) {
		this.usnTB = usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public void setPassTB(WebElement passTB) {
		this.passTB = passTB;
	}

	public WebElement getKeepMeLoggedIn() {
		return keepMeLoggedIn;
	}
	
	//operational method
	public void validLogin(String validUsername, String validPassword)
	{
		usnTB.sendKeys(validUsername);
		passTB.sendKeys(validPassword);
		loginButton.click();
	}
	
	public void invalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		usnTB.sendKeys(invalidUsername);
		passTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usnTB.clear();
	}
}
