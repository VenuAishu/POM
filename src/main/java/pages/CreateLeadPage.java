package pages;

import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{
	public CreateLeadPage VerifyCreateLeadsTitle()
	{
		verifyTitle("Create Lead | opentaps CRM");
		return this;	
	}
	public CreateLeadPage enterCompanyName(String userdata){
		enterById(prop.getProperty("Create.CompanyName.Id"), userdata);
		return this;
	}
	public CreateLeadPage enterFirstName(String userdata){
		enterById(prop.getProperty("Create.FirstName.Id"), userdata);
		return this;
	}
	public CreateLeadPage enterLastName(String userdata){
		enterById(prop.getProperty("Create.LastName.Id"), userdata);
		return this;
	}
	public ViewLeadPage clickCreateLead(){
		clickByClassName(prop.getProperty("Create.CreateLead.name"));
		return new ViewLeadPage();
	}

}
