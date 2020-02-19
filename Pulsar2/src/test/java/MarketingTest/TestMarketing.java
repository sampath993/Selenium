package MarketingTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.Qa.Base.Base;
import Marketing.After_Market_List;
import Marketing.Feature_SRP_AMO_Tech_AV;
import Marketing.Marketing;
import Marketing.Monitors;
import Marketing.Product_Requirement_List;


public class TestMarketing extends Base{

	Marketing clickonMRKT;
	Monitors monitors_Verification;
	After_Market_List AMO_Verification;
	Feature_SRP_AMO_Tech_AV FeatureLink_Verification;
	Product_Requirement_List Product_Requirement_List_Verification;




	public TestMarketing() {
		super();
	}
	@BeforeMethod
	public void setUp() {

		initialization();


		clickonMRKT = new Marketing();
		monitors_Verification = new Monitors();
		AMO_Verification = new After_Market_List();
		FeatureLink_Verification = new Feature_SRP_AMO_Tech_AV();
		Product_Requirement_List_Verification = new Product_Requirement_List();


		

	}



	@Test(priority = 1)
	public void Validate_Markeing_Page() {
		clickonMRKT.clickOnMarketing();
		monitors_Verification.CreatingMarketing();

	}
	@Test(priority = 2)
	public void Validate_AMO_Page() {
		clickonMRKT.clickOnMarketing();
		AMO_Verification.CreatingAMO();


	}
	@Test(priority = 3)
	public void Validate_Features_Page() {
		clickonMRKT.clickOnMarketing();
		FeatureLink_Verification.CreatingFeatures();
		

	}
	@Test(priority = 4)
	public void Validate_PRL_Page() {
		clickonMRKT.clickOnMarketing();
		Product_Requirement_List_Verification.CreatingFeatures();
		

	}




	@AfterMethod
	public void TearDown() {

		driver.quit();
	}




}
