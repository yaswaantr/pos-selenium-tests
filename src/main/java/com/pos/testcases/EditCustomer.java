package com.pos.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.pos.pages.LoginPage;

public class EditCustomer extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "EditCustomer";
		testDescription ="Verify The New customer name has updated";
		authors="Hari";
		category ="Smoke";
		excelFileName="EditCustomer";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String customerId,String customerName,String verifyEditPopup
			,String customerNameChanged) {
		System.out.println("Running Testcase : " + "EditCustomer");
		new LoginPage()
		.login()
		.clickCustomersMenu()
		.enterId(customerId)
		.clickEditIcon()
		.changeCustomerName(customerName)
		.clickSubmitButton()
		.verifyEditedPopup(verifyEditPopup)
		.clickOKButton()
		.enterId(customerId)
		.verifyCustomerNameChanged(customerId,customerNameChanged);
		
	}

}
