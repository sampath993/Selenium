package Com.Pulsar2.All_Services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class Find_Product extends Base{
	
	public Find_Product() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	

	//Find Product
		@FindBy(xpath="//div[@id='General']//div[@class='GenericMenuGroup--content--item col-12 col-lg-6 col-xl-4']/..//span[contains(text(),'Find Product (Legacy Search)')]")
		WebElement findProduct;
		//Part Number 
		@FindBy(xpath = "//input[@id='txtpartnumber']")
		WebElement partNumber;
		@FindBy(xpath = "//span//button[@id='btnPartno']")
		WebElement goPartNumber;

		//	Find Part - HP Restricted

		//Product Name
		@FindBy(xpath = "//input[@id='txtproductName']")
		WebElement findChangeReqProduct;
		@FindBy(xpath = "//span//button[@id='btnProductName']")
		WebElement goProduct;

		//Find Change Request Sudden Impacts 
		@FindBy(xpath = "//input[@id='txtSuddenImpact']")
		WebElement findChangeReqSuddenImpacts;
		@FindBy(xpath = "//span//button[@id='btnSuddenImpact']")
		WebElement goImpact;

		//Find Component
		@FindBy(xpath = "//input[@id='txtcomponent']")
		WebElement findChangeReqComponent;
		@FindBy(xpath = "//span//button[@id='btnComponent']")
		WebElement goComponent;

		//Change Request
		@FindBy(xpath = "//input[@id='txtchangerequest']")
		WebElement findChangeReqChangeRequest;
		@FindBy(xpath = "//span//button[@id='btnChangeRequest']")
		WebElement goChangeRequest;


		//Change Request
		@FindBy(xpath = "//input[@id='txtfeatures']")
		WebElement findChangeReqFeatures;
		@FindBy(xpath = "//span//button[@id='btnFeatures']")
		WebElement goFeatures;		
		@FindBy(xpath="//b[contains(text(), 'Material Description Found in the Corporate Data')]")
		WebElement window;

		public void validateFindProduct() {
			
			findProduct.click();
			partNumber.sendKeys("13");
			goPartNumber.click();
			
			
			findChangeReqProduct.sendKeys("basin");
			goProduct.click();
			

			findChangeReqSuddenImpacts.sendKeys("basin");
			goImpact.click();
			
			
			//findChangeReqComponent.sendKeys("basin");
			//goComponent.click();
			//findChangeReqChangeRequest.sendKeys("basin");
			//goChangeRequest.click();
			//	findChangeReqFeatures.sendKeys("basion");
			//goFeatures.click();
			
			
			
		}
		
		
		
		




}
