package Com.Pulsar2.All_Services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;


public class PulsarPlus extends Base{
	
	public PulsarPlus() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(), 'Go To New Layout')]")
	WebElement goToNewLayout;
	
	
	
	
	public void goToNewLayout() {
		
		goToNewLayout.click();
		
	}
	
	
	
	

}
