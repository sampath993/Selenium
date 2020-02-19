package Com.Pulsar2.All_Services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Qa.Base.Base;

public class FindAgencyNoteBook extends Base {

	//Find Agency - Note Book link
	@FindBy(xpath="//div[@id='General']//div[@class='GenericMenuGroup--content--item col-12 col-lg-6 col-xl-4']/..//span[contains(text(),'Find Agency - Notebook')]")
	WebElement findAgency;
	//Select Product
	@FindBy(name="selProduct")
	WebElement agencyProduct;
	//Select Country
	@FindBy(id="selCountry")
	WebElement agencyCountry;
	//Select Deliverable
	@FindBy(id="selDeliverable")
	WebElement agencyDeliverable;
	//Select Region
	@FindBy(id="selRegion")
	WebElement agencyRegion;
		
	public  FindAgencyNoteBook() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
public void validateFindAgency() {
	
	findAgency.click();
	Select AgeProduct = new Select(agencyProduct);
	
	AgeProduct.getOptions().get(1387).click();
	
	Select ageCountry = new Select(agencyCountry);
	ageCountry.getOptions().get(1).click();
	Select ageDeliverable = new Select(agencyDeliverable);
	ageDeliverable.getOptions().get(1).click();
	Select ageRegion = new Select(agencyRegion);
	ageRegion.getOptions().get(1).click();
	
	

	
}
    

}
