package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC09_CreateOpportunities extends OpentapsWrappers {
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC09_CreateOpportunities";
		testCaseName 	= "TC09_CreateOpportunities POM";
		testDescription = "CreateOpportunities in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password,String loginName,String oppName,String initialAcc, String initialLead,String initialStage) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCrmsfa()
		.navigateToOpportunitiesPage()
		.clickCreateOpportunities()
		.enterOpportunityName(oppName)
		.enterInitialAccount(initialAcc)
		.enterIntialLead(initialLead)
		.selectInitialStage(initialStage)
		.selectEstimatedCloseDate();		
	}
}
