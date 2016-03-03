package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC005CreateContact extends OpentapsWrappers {
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC005_CreateContacts";
		testCaseName 	= "TC05 - Create Contact (POM)";
		testDescription = "Create in Opentaps using POM framework";
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
		.navigateToCreateContact()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clikckCreateContact()
		.verifyContactFullName(firstName);
	}

}
