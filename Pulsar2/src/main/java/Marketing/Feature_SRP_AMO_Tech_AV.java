package Marketing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class Feature_SRP_AMO_Tech_AV extends Base{

	
	
	public  Feature_SRP_AMO_Tech_AV() {
		
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(xpath="//span[contains(text(),'Features (SRP, AMO, or TechAV)')]")
	WebElement FeaturesLink;

	
	
	
	
	public void CreatingFeatures() {
		FeaturesLink.click();

		

	
	}
	
	
	

	}


