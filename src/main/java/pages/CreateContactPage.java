package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateContactPage extends OpentapsWrappers {
	public CreateContactPage(){
		if(!verifyTitle("Create Contact | opentaps CRM")){
			Reporter.reportStep("This is NOT Contact page", "FAIL");
		}
	}
	public CreateContactPage enterFirstName(String firstName){
		enterById(prop.getProperty("CreateContact.FirstName.Id"), firstName);
		return this;
		
	}
	public CreateContactPage enterLastName(String lastName){
		enterById(prop.getProperty("CreateContact.LastName.Id"), lastName);
		return this;
		
	}
	public ViewContactPage clikckCreateContact(){
		clickByName(prop.getProperty("CreateContact.CreatContactButton.Name"));
		return new ViewContactPage();
		
	}
	
}
