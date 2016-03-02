package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class OpportunitiesPage extends OpentapsWrappers {
	
	public OpportunitiesPage(){
		if(!verifyTitle("Opportunities | opentaps CRM")){
			Reporter.reportStep("This is NOT Opportunities page", "FAIL");
		}
	}
	public CreateOpportunitiesPage clickCreateOpportunities(){
		clickByLink(prop.getProperty("OpportunitiesPage.createOpportunities.linkText"));
		return new CreateOpportunitiesPage();
		
	}

}
