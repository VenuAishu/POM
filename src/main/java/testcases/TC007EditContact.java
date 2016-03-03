package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC007EditContact extends OpentapsWrappers {
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC007_EditContacts";
		testCaseName 	= "TC07 - Edit Contact (POM)";
		testDescription = "Edit Contacts in Opentaps using POM framework";
	}
	@Test(dataProvider="fetchData")
	public void startTestCase(String username,String password,String loginName,String firstName,String lastName,String UpdateLastName){
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCrmsfa()
		.navigateToContactPage()
		.navigateToFindContact()
		.enterFirstName(firstName)
		.enterlastName(lastName)
		.clickFindContacts()
		.clickContactsFirstName(firstName)
		.clickEdit()
		.updateLastName(UpdateLastName)
		.clickUpdate()
		.verifyContactLastName(UpdateLastName);		
		
	}

}
