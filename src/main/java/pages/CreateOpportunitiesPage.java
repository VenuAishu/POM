package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateOpportunitiesPage extends OpentapsWrappers {
	public CreateOpportunitiesPage(){
		if(!verifyTitle("Create Opportunity | opentaps CRM")){
			Reporter.reportStep("This is NOT Create Opportunities page", "FAIL");
		}
	}
	public CreateOpportunitiesPage enterOpportunityName(String opportunityName){
		enterById(prop.getProperty("CreateOpportunitiesPage.opportunityName.id"), opportunityName);
		return this;		
	}
	public CreateOpportunitiesPage enterInitialAccount(String initialAccount){
		enterById(prop.getProperty("CreateOpportunitiesPage.initialAccount.id"), initialAccount);
		return this;		
	}
	public CreateOpportunitiesPage enterIntialLead(String initialLead){
		enterById(prop.getProperty("CreateOpportunitiesPage.initialLead.id"),initialLead);
		return this;		
	}
	public CreateOpportunitiesPage selectInitialStage(String initialStage){
		selectById(prop.getProperty("CreateOpportunitiesPage.initialStage.id"), initialStage);
		//enterById(prop.getProperty("CreateOpportunitiesPage.initialStage.id"), initialStage);
		return this;		
	}
	public CreateOpportunitiesPage selectEstimatedCloseDate(){
		clickById(prop.getProperty("CreateOpportunitiesPage.clickCalendar.id"));
		clickByClassName(prop.getProperty("CreateOpportunitiesPage.selectEstimatedCloseDate.class"));
		return this;		
	}
	public CreateOpportunitiesPage clickCreateOpportunitiesButton(){
		clickByName(prop.getProperty("CreateOpportunitiesPage.createOpportunitiesButton.name"));
		return this;		
	}
}
