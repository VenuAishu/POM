package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ContactsPage extends OpentapsWrappers {
	public ContactsPage(){
		if(!verifyTitle("My Contacts | opentaps CRM")){
			Reporter.reportStep("This is NOT Contact page", "FAIL");
		}
	}
	public CreateContactPage navigateToCreateContact(){
		clickByLink(prop.getProperty("Contact.CreateContact.LinkText"));
		return new CreateContactPage();
		//
	}
	public FindContactsPage navigateToFindContact(){
		clickByLink(prop.getProperty("Contact.FindContact.LinkText"));
		return new FindContactsPage();
		
	}


}
