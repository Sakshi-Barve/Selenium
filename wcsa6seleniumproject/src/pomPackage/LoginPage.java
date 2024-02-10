package pomPackage;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class LoginPage {
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(name = "pwd") private WebElement passTB;
	@FindBy(id = "loginButton") private WebElement loginButton;
	@FindBy(id = "keepLoggedInCheckBox") private WebElement checkbox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;
	@FindBy(id = "licenseLink") private WebElement licenseLink;
	
	
	//initialization
	//we need to create constructor
	//It initializes the WebElements in the Page Object class, associating them with the actual elements on the web page.
	//It uses the provided driver instance to locate and interact with these elements.
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	//utilization
	//create getter methods 
	//for creating getter methods we need to right click --> source --> generate getter and setters --> and select getters
	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}


	public WebElement getActiMindLink() {
		return actiMindLink;
	}


	public WebElement getLicenseLink() {
		return licenseLink;
	}	
	
	
	//operational
		public void validLogin(String validUsername,String validPassword)
		{
			usnTB.sendKeys(validUsername);
			passTB.sendKeys(validPassword);
			loginButton.click();
		}
		
		public void inValidLogin(String inValidUsername,String inValidPassword) throws InterruptedException
		{
			usnTB.sendKeys(inValidUsername);
			passTB.sendKeys(inValidPassword);
			loginButton.click();
			Thread.sleep(2000);
			usnTB.clear();
		}
	
	
}
