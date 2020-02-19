package Marketing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class Marketing extends Base{
	
	
    public Marketing() {
    	PageFactory.initElements(driver, this);
    	
    }

    
    
	//All Services
	@FindBy(xpath= "//span[contains(text(),'All Services')]")
	WebElement allService;
	//Marketing Module
	
	
	
	public void clickOnMarketing() {
		allService.click();
		

	
	}
    
}
