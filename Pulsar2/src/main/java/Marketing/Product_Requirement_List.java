package Marketing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class Product_Requirement_List extends Base{
	
	public  Product_Requirement_List() {
		
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(xpath="//span[contains(text(),'Product Requirements List (PRL)')]")
	WebElement Product_RequirementsList;

	
	
	
	
	public void CreatingFeatures() {
		Product_RequirementsList.click();

		

	
	}
	
	

}
