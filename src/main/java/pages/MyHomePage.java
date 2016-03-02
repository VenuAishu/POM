package pages;

import org.testng.annotations.Test;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyHomePage extends OpentapsWrappers {
	public MyHomePage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}

	public LeadsPage navigateToLeadPage() {
		clickByLink(prop.getProperty("MenuPage.Leads.LinkText"));
		return new LeadsPage();

	}
	public ContactsPage navigateToContactPage(){
		clickByLink(prop.getProperty("MenuPage.Contacts.LinkText"));
		return new ContactsPage();

	}

	public CreateLeadPage clickCreateLead(){
		clickByLink(prop.getProperty("MenuPage.CreateLead.Link"));
		return new CreateLeadPage();

	}
	public OpportunitiesPage navigateToOpportunitiesPage() {
		  clickByLink(prop.getProperty("MenuPage.Oppurtunities.LinkText"));
		  return new OpportunitiesPage();
		  
	  }
	

}
