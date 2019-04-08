package testngLearn;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends PSM {
	
	@BeforeTest
	public void setData()
	{
	excelfilename="Login";	
	}
	@Test(dataProvider="fetchData")
	public  void create(String cname, String fname, String lname) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();
	}
}