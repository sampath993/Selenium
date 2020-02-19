package Com.Pulsar2.All_Services;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Qa.Base.Base;

public class AddProduct extends Base{

	public AddProduct() {
		PageFactory.initElements(driver, this);

	}


	//Add Product
	@FindBy(xpath="//div[@id='General']//div[@class='GenericMenuGroup--content--item col-12 col-lg-6 col-xl-4']/..//span[contains(text(),'Add Product')]")
	WebElement productLink;
	//cmdOK Add Product click

	//MyWindow
	@FindBy(xpath = "//input[contains(@name,'cmdOK')]")
	WebElement productok;
	//Product Name
	@FindBy(xpath = "//input[@id= 'txtProductNameBase']")
	WebElement productName;
	//Product Family
	@FindBy(xpath="//select[@name='cboFamily']")
	WebElement proFamily;
	//Partner
	@FindBy(xpath="//select[@name='cboPartner']")
	WebElement parnr;
	//Dev.Center
	@FindBy(xpath="//select[@name='cboDevCenter']")
	WebElement devcentr;
	//Pre - Install Team
	@FindBy(xpath="//select[@name='cboPreinstall']")
	WebElement preInstalltm;
	//Release Teaam
	@FindBy(xpath="//select[@name='cboReleaseTeam']")
	WebElement releasetm;
	//Phase
	@FindBy(xpath="//select[@name='cboPhase']")
	WebElement ph;
	//Product Type
	@FindBy(xpath="//select[@name='cboType']")
	WebElement type;
	//Bussiness Segment
	@FindBy(xpath="//select[@name='cboBusinessSegmentID']")
	WebElement bSegment;
	//Release

	//Product Line
	@FindBy(name="cboProductLine")
	WebElement pLine;
	//Distribution List	
	@FindBy(xpath="//textarea[@name='txtDistribution']")
	WebElement distributionList;
	//Product Description
	@FindBy(xpath="//textarea[@name='txtDescription']")
	WebElement productDescription;
	//System Team link
	@FindBy(xpath ="//a[contains(text(), 'System Team')]")
	WebElement sytemTeam;
	//System Manager
	@FindBy(xpath= "//select[@name='cboSM']")
	WebElement sManger;
	//SystemEngineering PM
	@FindBy(xpath="//select[@name='cboTDCCM']")
	WebElement sePM;
	//Program Office Program Manager
	@FindBy(xpath="//select[@name='cboTDCCM']")
	WebElement pOPM;

	//OK Button
	@FindBy(xpath="//input[@name ='cmdSubmit']")
	WebElement okButton;
	//Clear Form
	@FindBy(xpath = "//input[@name='cmdClear']")
	WebElement clearForm;
	//Cancel
	@FindBy(xpath="//input[@name='cmdEditCancel']")
	WebElement cancel;







	public void CreatingProduct() throws InterruptedException{
		productLink.click();
		driver.switchTo().frame("RightWindow");
		driver.switchTo().frame("MyWindow");
	//	JavascriptExecutor executor = (JavascriptExecutor)driver;
	//	executor.executeScript("arguments[0].click();", productok);
		productok.click();
		//TopWindow
		//frm.moveFrames();
	
		/*	try {
			Thread.sleep(3000);
			driver.switchTo().frame("RightWindow");
			Thread.sleep(3000);
			//driver.switchTo().frame("TopWindow");
			//Thread.sleep(3000);
			driver.switchTo().frame("MyWindow");
			Thread.sleep(3000);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", productok);
			productok.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		productName.sendKeys("Monitor Keys");
		Select productFamily = new Select(proFamily);
		productFamily.selectByValue("1270");
		Select partner = new Select(parnr);
		partner.selectByValue("210");
		Select devCenter = new Select(devcentr);
		devCenter.selectByValue("2");
		Select preInstallTeam = new Select(preInstalltm);
		preInstallTeam.selectByValue("2");
		Select releaseTeam = new Select(releasetm);
		releaseTeam.selectByValue("2");
		Select phase = new Select(ph);
		phase.selectByValue("1");
		Select productType = new Select(type);
		productType.selectByValue("3");
		Select businessSegment = new Select(bSegment);
		businessSegment.selectByValue("2");
		Select productLine = new Select(pLine);
		productLine.selectByValue("17");
		distributionList.sendKeys("test@hp.com");
		productDescription.sendKeys("test");
		sytemTeam.click();
		Select systemManager = new Select(sManger);
		systemManager.selectByIndex(1);
		Select systemEngineering = new Select(sePM);
		systemEngineering.selectByIndex(1);
		Select programOfficeProgramMangaer = new Select(pOPM);
		programOfficeProgramMangaer.selectByIndex(1);
		okButton.click();
		//clearForm.click();
		//cancel.click();







	}

}
