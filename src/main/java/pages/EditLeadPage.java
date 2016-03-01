package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers {
	public EditLeadPage() {

		if(!verifyTitle(" opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}
	}

	public EditLeadPage VerifyEditLeadTitle()
	{
		verifyTitle(" opentaps CRM");
		return this;	
	}
	public EditLeadPage EditCompanyName(String userdata){
		enterById(prop.getProperty("Create.CompanyName.Id"), userdata);
		return this;
	}
	public EditLeadPage EditFirstName(String userdata){
		enterById(prop.getProperty("Create.FirstName.Id"), userdata);
		return this;
	}
	public EditLeadPage EditLastName(String userdata){
		enterById(prop.getProperty("Create.LastName.Id"), userdata);
		return this;
	}
	public ViewLeadPage clickUpdate(){
		clickByXpath(prop.getProperty("//input[@value='Update']"));
		return new ViewLeadPage();
	}
}
