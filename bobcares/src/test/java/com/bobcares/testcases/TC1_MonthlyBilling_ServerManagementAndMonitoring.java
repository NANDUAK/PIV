package com.bobcares.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ServerManagement;

public class TC1_MonthlyBilling_ServerManagementAndMonitoring extends base_class{
	@Test
	public void f() throws Exception {
		d.get(baseURL);	
		logger.info("URL is opened");
		try {
			ServerManagement SM=new ServerManagement(d);
			Thread.sleep(5000);
			SM.click_servermanagement_btn();
			Thread.sleep(2000);
			logger.info("click server management");
			Thread.sleep(2000);
			SM.monthly_billing_click();
			logger.info("click monthly billing");
			Thread.sleep(2000);
			SM.price_button_click();
			logger.info("click price button");
			Thread.sleep(2000);		
			SM.twoserver_btn_choose();
			logger.info("choose 2 servers");
			Thread.sleep(2000);	
			SM.continue_btn_click();
			logger.info("click on continue");
			Thread.sleep(5000);


			String Actual="Server Management - Server Monitoring & Management - 2 Servers - Monthly";
			String Expected=SM.selectedService_Gettext();
			Assert.assertEquals(Actual, Expected);
			logger.info("test passed assert pass");
			
		}catch (Exception e) {
			e.printStackTrace();
			captureScreen(d, "TC1");
			throw new Exception();	

		}catch(AssertionError e) {
			e.printStackTrace();
			captureScreen(d, "TC1");
			throw new Exception();	
		}
	}
}
