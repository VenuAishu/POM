package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{
	public ViewLeadPage() {

		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}
	}

	public ViewLeadPage VerifyViewLeadTitle()
	{
		verifyTitle("View Lead | opentaps CRM");
		return this;	
	}
	public EditLeadPage ClickEdit()
	{
		clickByLink(prop.getProperty("View.EditButton.Link"));
		return new EditLeadPage();
	}
	public MyLeadsPage ClickDelete()
	{
		clickByLink(prop.getProperty("View.DeleteButton.Link"));
		return new MyLeadsPage();
	}
	
	// methods to verify the first , last and company name missing
	public ViewLeadPage verifyCompanyName(String userdata){
		verifyTextContainsById(prop.getProperty("View.companyname.id"), userdata);
		return this;	
	}
	public ViewLeadPage verifyFirstName(String userdata){
		verifyTextContainsById(prop.getProperty("View.firstname.id"), userdata);
		return this;	
	}
	public ViewLeadPage verifyLastName(String userdata){
		verifyTextContainsById(prop.getProperty("View.lastname.id"), userdata);
		return this;	
	}
}
