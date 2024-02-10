package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {
	@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement Project_Customers_SubModule;
	@FindBy(xpath="//input[@value='Create New Customer']") private WebElement Create_New_Customer_Button;
	@FindBy(xpath = "//input[@value='Create New Project']") private WebElement Create_New_Project_Button;
	@FindBy(name = "name") private WebElement Customer_Name_TB;
	@FindBy(name = "createCustomerSubmit") private WebElement Create_CustomerButton ;
	@FindBy(xpath = "//select[@name='customerId']") private WebElement Customer_DropDown;
	@FindBy(xpath = "//input[@name='name']") private WebElement Project_Name_TB;
	@FindBy(name = "createProjectSubmit") private WebElement Create_Project_Button;
	@FindBy(partialLinkText = "All") private WebElement selectAllCust_ProjectCheckBox;
	@FindBy(xpath = "//input[@value='Delete Selected']") private WebElement deleteSelectedButton;
	@FindBy(id="deleteButton") private WebElement deleteButtonPopup; 
	
	
	public TasksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


		
	public WebElement getProject_Customers_SubModule() {
		return Project_Customers_SubModule;
	}



	public WebElement getCreate_New_Customer_Button() {
		return Create_New_Customer_Button;
	}



	public WebElement getCreate_New_Project_Button() {
		return Create_New_Project_Button;
	}



	public WebElement getCustomer_Name_TB() {
		return Customer_Name_TB;
	}



	public WebElement getCreate_CustomerButton() {
		return Create_CustomerButton;
	}



	public WebElement getCustomer_DropDown() {
		return Customer_DropDown;
	}



	public WebElement getProject_Name_TB() {
		return Project_Name_TB;
	}



	public WebElement getCreate_Project_Button() {
		return Create_Project_Button;
	}



	public WebElement getSelectAllCust_ProjectCheckBox() {
		return selectAllCust_ProjectCheckBox;
	}



	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}



	public WebElement getDeleteButtonPopup() {
		return deleteButtonPopup;
	}



	public void create_New_Customer(String customerName) throws InterruptedException
	{
		Thread.sleep(2000);
		
		Project_Customers_SubModule.click();
		Create_New_Customer_Button.click();
		Customer_Name_TB.sendKeys(customerName);
		Create_CustomerButton.click();
	}
	public void create_New_Project(String customerName,String projectName) throws InterruptedException
	{
		Thread.sleep(2000);
		Create_New_Project_Button.click();
		Select sel= new Select(Customer_DropDown);
		sel.selectByVisibleText(customerName);
		Project_Name_TB.sendKeys(projectName);
		Create_Project_Button.click();
	}
	
	public void deleteCust_ProjectMethod()
	{
		Project_Customers_SubModule.click();
		selectAllCust_ProjectCheckBox.click();
		deleteSelectedButton.click();
		//deleteButtonPopup.click();
	}
}
