package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewContactPage extends OpentapsWrappers{
	public ViewContactPage(){
			if(!verifyTitle("View Contact | opentaps CRM")){
				Reporter.reportStep("This is NOT ViewContact page", "FAIL");
			}
	}
	public ViewContactPage verifyContactFullName(String firstName){
		verifyTextContainsById(prop.getProperty("ViewContact.FullName.Id"),firstName);
		return this;		
	}
	public ViewContactPage verifyContactLastName(String lastName){
		verifyTextContainsById(prop.getProperty("ViewContact.LastName.id"),lastName);
		return this;		
	}
	public EditContactPage clickEdit(){
		clickByLink(prop.getProperty("ViewContact.Edit.LinkText"));
		return new EditContactPage();		
	}
	
	// last name verification missing
	// edit and delete methods missing
	

}
