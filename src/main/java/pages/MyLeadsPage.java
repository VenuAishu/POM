package pages;

import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers {
public MyLeadsPage VerifyLeadsTitle()
{
	verifyTitle("My Leads | opentaps CRM");
	return this;	
}
public FindLeadsPage ClickFindLeads()
{
	clickByLink(prop.getProperty("MyLeads.FindLeads.Link"));
	return new FindLeadsPage();
}

}
