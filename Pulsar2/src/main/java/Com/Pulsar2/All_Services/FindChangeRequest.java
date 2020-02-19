package Com.Pulsar2.All_Services;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class FindChangeRequest extends Base{


	//Find Change Request 
	@FindBy(xpath="//div[@id='General']//div[@class='GenericMenuGroup--content--item col-12 col-lg-6 col-xl-4']/..//span[contains(text(),'Find Change Request (Legacy Search)')]")
	WebElement findChangeRequest;
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


	//initializing the page objects
	public FindChangeRequest() {
		PageFactory.initElements(driver, this);

	}
	public void switchToWindow(int index) throws InterruptedException {


		String windowId = null;
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iter = windowIds.iterator();

		for (int i = 1; i <= index; i++) {

			windowId = iter.next();
			driver.switchTo().window(windowId);

		}



	}
	public void validateFindChangeRequest() throws InterruptedException {

		findChangeRequest.click();
		partNumber.sendKeys("13");
		goPartNumber.click();

		System.out.println("title new =  " + driver.getTitle());
		
		Thread.sleep(3000);
		
		switchToWindow(2);   //it will iterate 2 times and go to the child window 

		System.out.println("title new = " + driver.getTitle());
		Thread.sleep(3000);
		//driver.close();
		switchToWindow(1);  // it will iterate 1 time and go to the main window

		System.out.println("title new = " + driver.getTitle());

	
		/*	
		Thread.sleep(3000);
		System.out.println("mainwindow"+driver.getTitle());
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String>iter = windowids.iterator();
		String mainWindow = iter.next();
		String childWindow = iter.next();
		driver.switchTo().window(childWindow);
		System.out.println("New window");
		Thread.sleep(3000);
		driver.switchTo().window(mainWindow);

		System.out.println("Main Window"+driver.getTitle());
		 
*/


		/*
		 * String window2 = driver.getTitle();
		 * 
		 * if (window2.equals ("Find Part - HP Restricted")) {
		 * 
		 * driver.close();
		 * 
		 * }
		 */ 


		findChangeReqProduct.sendKeys("basin");
		goProduct.click();
		
		Thread.sleep(5000);
		switchToWindow(2);   //it will iterate 2 times and go to the child window 

		System.out.println("title child window title  = " + driver.getTitle());

		Thread.sleep(3000);
		driver.close();
		switchToWindow(1);  // it will iterate 1 time and go to the main window


		
		findChangeReqSuddenImpacts.sendKeys("basin");
		goImpact.click();
		Thread.sleep(5000);
		switchToWindow(2);   //it will iterate 2 times and go to the child window 

		System.out.println("title new" + driver.getTitle());

		Thread.sleep(3000);
		driver.close();
		switchToWindow(1);  // it will iterate 1 time and go to the main window


		//findChangeReqComponent.sendKeys("basin");
		//goComponent.click();
		//findChangeReqChangeRequest.sendKeys("basin");
		//goChangeRequest.click();
		//	findChangeReqFeatures.sendKeys("basion");
		//goFeatures.click();




	}

}
