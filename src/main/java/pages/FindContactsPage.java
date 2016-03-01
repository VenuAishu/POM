package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindContactsPage extends OpentapsWrappers {
	public FindContactsPage(){
		if(!verifyTitle("Find Contacts | opentaps CRM")){
			Reporter.reportStep("This is NOT Contact page", "FAIL");
		}
	}
	public FindContactsPage enterFirstName(String firstName){
		enterByXpath(prop.getProperty("FindContact.FirstName.Xpath"), firstName);
		return this;		
	}
	public FindContactsPage enterlastName(String lastName){
		enterByXpath(prop.getProperty("FindContact.lasttName.Xpath"), lastName);
		return this;		
	}
	public FindContactsPage clickFindContacts(){
		clickByXpath(prop.getProperty("FindContact.FindContactsButton.Name"));
		return this;		
	}
}
