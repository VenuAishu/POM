package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditContactPage extends OpentapsWrappers {
	public EditContactPage(){
		if(!verifyTitle("opentaps CRM")){
			Reporter.reportStep("This is NOT Edit Contact page", "FAIL");
		}
	}
	public EditContactPage updateLastName(String updatedLastName){
		enterById(prop.getProperty("EditContactPage.Lastname.id"), updatedLastName);
		return this;		
	}
	public ViewContactPage clickUpdate(){
		clickByXpath(prop.getProperty("EditContactPage.Updatebutton.Xpath"));
		return new ViewContactPage();		
	}


}
