package Com.Pulsar2.All_Services;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class Pulsar2_NewLayout extends Base{

	public Pulsar2_NewLayout() {

		PageFactory.initElements(driver, this);

	}
	
	Pulsar2_NewLayout newLayoutVerification = new Pulsar2_NewLayout();
	PulsarPlus 	newlayout = new PulsarPlus();
	

	public void pulsar(){


		if (newLayoutVerification != null) {
			

			System.out.println("verification of Pulsar 2");

		}
		else {
			newlayout.goToNewLayout();
			System.out.println("New layout displayed");

		}

	}
}

