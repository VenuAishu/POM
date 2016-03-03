package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateContactPage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC005ACreateContactNegativeTC extends OpentapsWrappers {
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC005A_CreateContactsNegativeTC";
		testCaseName 	= "TC05A - Create Contact Negative Test(POM)";
		testDescription = "Create Contact negative tests in Opentaps using POM framework";
	}
	String isLogin=null;
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
			.enterLastName(lastName);
			clickByName(prop.getProperty("CreateContact.CreatContactButton.Name"));
			System.out.println(getTextByClass("errorMessage"));		
		
	}

}
