package Com.Pulsar2.All_Services;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import Com.Pulsar2.All_Services.AddProduct;

import Com.Qa.Base.Base;

public class AddUserAccount extends Base{
	

	//Add User Account 
	@FindBy(xpath= "//div[@id='General']//div[@class='GenericMenuGroup--content--item col-12 col-lg-6 col-xl-4']/..//span[contains(text(),'Add User Account')]")
	WebElement addUserAccount;
	@FindBy(xpath = "//input[@id ='txtFirstName']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id ='txtLastName']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id ='txtEmail']")
	WebElement email;

	@FindBy(id= "ddlPartners")
		WebElement partners;
	
	@FindBy(xpath = "//input[@id ='txtNTName']")
	WebElement ntName;
	@FindBy(xpath = "//input[@id ='txtPhone']")
	WebElement phoneNo;
	
	@FindBy(xpath = "//input[@id ='btnSave']")
	WebElement saveButton;
	/*
	 * @FindBy(xpath = "//input[@id ='btnCancel']") 
	 * WebElement cancelButton;
	 */	
	
	
	public AddUserAccount() {
    	PageFactory.initElements(driver, this);
    	
    }
	public void validateaddUserAccount() {
		
		addUserAccount.click();
		firstName.sendKeys("Test");
		lastName.sendKeys("pulsar");
		email.sendKeys("testpulsar@hp.com");
		Select partnerselect = new Select(partners);
		partnerselect.getOptions().get(2).click();
		ntName.sendKeys("Hp1");
		phoneNo.sendKeys("8801712637");
		//saveButton.click();
		
		//cancelButton.click();
			
	}
	

}
