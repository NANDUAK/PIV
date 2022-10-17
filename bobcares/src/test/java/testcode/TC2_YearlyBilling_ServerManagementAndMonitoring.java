package testcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ServerManagement;

public class TC2_YearlyBilling_ServerManagementAndMonitoring extends base_class {
  @Test
  public void TC_2() throws Exception {
		logger.info("URL is opened");
		try {
			ServerManagement SM=new ServerManagement(d);
			Thread.sleep(5000);
			SM.click_servermanagement_btn();
			Thread.sleep(2000);
			logger.info("click server management");
			Thread.sleep(2000);
			SM.annualy_billing_click();
			logger.info("click annual billing");
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


			String Actual="Server Management - Server Monitoring & Management - 1 Server - Annually";
			String Expected=SM.selectedService_Gettext();
			Assert.assertEquals(Actual, Expected);
			logger.info("test passed assert pass");
			
		}catch (Exception e) {
			e.printStackTrace();
			captureScreen(d, "TC2");
			throw new Exception();	

		}catch(AssertionError e) {
			e.printStackTrace();
			captureScreen(d, "TC2");
			throw new Exception();	
		}  }
}
