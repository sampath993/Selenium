package Com.Pulsar2.All_Services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class General extends Base {
	
	
	
	//"//h4/a[contains(text(),'SAP M')]"
	//Pulsar Image
	@FindBy(xpath= "//a//h1[contains(text(), 'Pulsar')]")
	WebElement pulsarImage;
	//All Services
	@FindBy(xpath= "//span[contains(text(),'All Services')]")
	WebElement allService;
	
	//General
	@FindBy(xpath="//a[contains(text(),'General')]")
	WebElement general;


    //initializing the page objects
    public General() {
    	PageFactory.initElements(driver, this);
    	
    }
    //Actions for validating Title
    public String validateHomePage() {
    	
    	System.out.println("Home page title is= " + driver.getTitle());
		return driver.getTitle();
    	
    	
    }

    
    
    //Validating Pulsar Header Image
    public boolean validatePulsarImage() {
    	
    	System.out.println("Home page logo is= " +pulsarImage.isDisplayed());
    	
    	return pulsarImage.isDisplayed();
    	
    
    }
    
    //validate General Page
    public void validateGeneralPage() {
    	allService.click();
    	general.click();
    
    }

    
}
