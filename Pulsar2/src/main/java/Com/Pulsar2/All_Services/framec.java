package Com.Pulsar2.All_Services;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class framec extends Base{
	
	public framec() {
    	PageFactory.initElements(driver, this);
    	
    }

	public void moveFrames() {
		
		driver.switchTo().frame(0);
	//	WebElement ok = driver.findElement(By.xpath("//input[contains(@name,'cmdOK')]"));
		//driver.switchTo().frame(ok);
		//ok.click();
		
		
	} 
		
}
