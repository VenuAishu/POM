package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewContactPage extends OpentapsWrappers{
	public ViewContactPage(){
			if(!verifyTitle("View Contact | opentaps CRM")){
				Reporter.reportStep("This is NOT ViewContact page", "FAIL");
			}
	}
	public ViewContactPage verifyContactName(String firstName){
		verifyTextContainsById(prop.getProperty("ViewContact.FullName.Id"),firstName);
		return this;
		
	}
	
	// last name verification missing
	// edit and delete methods missing
	

}
