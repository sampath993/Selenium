package GeneralTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.Pulsar2.All_Services.AddProduct;
import Com.Pulsar2.All_Services.AddUserAccount;
import Com.Pulsar2.All_Services.Find_Features;
import Com.Pulsar2.All_Services.Find_Product;
import Com.Pulsar2.All_Services.Find_Suddent_Impact;
import Com.Pulsar2.All_Services.FindAgencyNoteBook;
import Com.Pulsar2.All_Services.FindChangeRequest;
import Com.Pulsar2.All_Services.Find_Component;
import Com.Pulsar2.All_Services.General;
import Com.Pulsar2.All_Services.Pulsar2_NewLayout;
import Com.Pulsar2.All_Services.PulsarPlus;
import Com.Pulsar2.Util.TestUtil;
import Com.Qa.Base.Base;
import Marketing.Monitors;


public class TestGeneraltab extends Base{

	General general;
	AddUserAccount pullUserAccount;
	AddProduct pullAddProduct;
	TestUtil testutil;
	FindAgencyNoteBook agency;
	FindChangeRequest chngReq;
	Find_Features findFeaures;
	Find_Component findComponents;
	Find_Product findProduct;
	Find_Suddent_Impact findSuddenImpact;
	Monitors monitors;

	
	
	public TestGeneraltab() {
		super();
	}
	@BeforeMethod
	public void setUp() {

		initialization();
		general =new General();
		pullUserAccount = new AddUserAccount();
		pullAddProduct = new AddProduct();
		testutil = new TestUtil();
		agency = new FindAgencyNoteBook();
		chngReq = new FindChangeRequest();
		findFeaures = new Find_Features();
		findComponents = new Find_Component();
		findProduct = new Find_Product();
		findSuddenImpact = new Find_Suddent_Impact();
		monitors = new Monitors();
	
	
		
	}

	
	
	//Pulsar browser Title verification
	@Test(priority = 1)
	public void HomePageTitleTest() {
		String title = general.validateHomePage();
		Assert.assertEquals(title, "Pulsar");
	   	

	}
	//Pulsar Logo Verification

	@Test(priority = 2)
	public void PulsarLogTest() {
		boolean logo = general.validatePulsarImage();
		Assert.assertTrue(logo);

	}
	//General page with AddProduct
	@Test(priority = 3)
	public void VerificationAddProduct() throws InterruptedException {
		general.validateGeneralPage();
		pullAddProduct.CreatingProduct();
		//addproDetails.CreatingAddProductDetails();
		
	}
	//General page with USer Account
	@Test(priority = 4)
	public void validateUserAccount() {
		general.validateGeneralPage();
		pullUserAccount.validateaddUserAccount();
		
	}
	//Find Agency - Note Book 
	@Test(priority = 5)
	public void validateFindAgencyNoteBook() {
		general.validateGeneralPage();
		agency.validateFindAgency();
		
	}
	//Find Change Request(Legacy Search)
		@Test(priority = 6)
		public void validateFindChangeRequest() throws InterruptedException {
			general.validateGeneralPage();
		//	chngReq.validateFindChangeRequest();
			findFeaures.validateFindFeatures();
		}
	//Find Feature (Legacy Search)
			@Test(priority = 7)
			public void validateFindFeature() throws InterruptedException {
				general.validateGeneralPage();
				findFeaures.validateFindFeatures();
			
			
		}

			//Find Components (Legacy Search)
			@Test(priority = 8)
			public void validateFindComponent() {
				general.validateGeneralPage();
				findComponents.validateFindComponents();	
		}
			
			//Find Components (Legacy Search)
			@Test(priority = 9)
			public void validateFindProduct() {
				general.validateGeneralPage();
				findProduct.validateFindProduct();
			
		}
			
			@Test(priority = 10)
			public void validateFindSuddenImpact() {
				general.validateGeneralPage();
				findSuddenImpact.validateFindSuddentImpact();
			
		}
			@Test(priority = 11)
			public void ValidateMarkeing() {
				general.validateGeneralPage();
				monitors.CreatingMarketing();
			
		}
			
			
			
			
			
	@AfterMethod
	public void TearDown() {

		driver.quit();
	}




}
