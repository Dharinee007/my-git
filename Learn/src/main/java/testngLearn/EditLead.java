package testngLearn;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends PSM{
	@BeforeTest
	public void setData()
	{
	excelfilename="EditLead";	
	}
	@Test(dataProvider="fetchData")
	public void Edittest(String LeadID,String CompanyName)throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(LeadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(20000);
		driver.findElementByXPath("(//input[@type='text'])[29]").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(CompanyName);
		driver.findElementByName("submitButton").click();
	}

	}




