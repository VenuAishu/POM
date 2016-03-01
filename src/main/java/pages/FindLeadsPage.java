package pages;

import org.testng.annotations.Test;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers {
	public FindLeadsPage() {

		if(!verifyTitle("Find Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}
	public FindLeadsPage VerifyFindLeadsTitle()
	{
		verifyTitle("Find Leads | opentaps CRM");
		return this;	
	}	

  public FindLeadsPage enterFirstName(String firstName) {
	  
	  enterByXpath(prop.getProperty("FindLead.Firstname.Xpath"), firstName);
	  return this;
  }

  public FindLeadsPage enterLastName(String lastName) {
	  
	  enterByXpath(prop.getProperty("FindLead.Lastname.Xpath"), lastName);
	  return this;
  }


public FindLeadsPage enterCompanyName(String companyName) {
	  
	  enterByXpath(prop.getProperty("FindLead.Companyname.Xpath"), companyName);
	  return this;
}

public FindLeadsPage clickFindLeadsbutton() {
	
	clickByXpath(prop.getProperty("FindLead.FindLeadsButton.Xpath"));
	return this;
	
}

public ViewLeadPage ClickLeadResult()
{
	clickByLink(prop.getProperty("FindLead.ClickResultList.link"));
	return new ViewLeadPage();
}
}