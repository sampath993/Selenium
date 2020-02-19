package Marketing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class After_Market_List extends Base {

	
	public  After_Market_List() {
		
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(xpath="//span[contains(text(),'After Market Option List (AMO)')]")
	WebElement AMOLink;

	
	
	
	
	public void CreatingAMO() {
		AMOLink.click();

		

	
	}
	
	
	
	
}
