package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC006FindContact extends OpentapsWrappers{
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC006_FindContacts";
		testCaseName 	= "TC06 - Find Contact (POM)";
		testDescription = "Find Contacts in Opentaps using POM framework";
	}
	@Test(dataProvider="fetchData")
	public void startTestCase(String username,String password,String loginName,String firstName,String lastName){
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
		.clickFindContacts();
	}

}


