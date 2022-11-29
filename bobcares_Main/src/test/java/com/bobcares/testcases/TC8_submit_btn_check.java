package com.bobcares.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ServerManagement;

public class TC8_submit_btn_check extends base_class {
	@Test
	public void TC8() throws Exception {
		try{
			ServerManagement SM=new ServerManagement(d);
			Thread.sleep(3000);
			SM.click_servermanagement_btn();
			logger.info("click server management");
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollBy(0,6500)", "");
			Thread.sleep(4000);
			logger.info("scroll down");
			SM.submit_btn_click();
			Thread.sleep(5000);
			logger.info("submit btn");
			
			String Actual="Name: This field is required. Please complete the following fields: First.";
			String Expected=SM.Namefield_error_gettext();
			Assert.assertEquals(Actual, Expected);
			logger.info("name error present");
			
			String Actuall="Email: This field is required.";
			String Expectedd=SM.Emailfield_error_gettext();
			Assert.assertEquals(Actuall, Expectedd);
			logger.info("Email_error present");

		}catch (Exception e) {
			e.printStackTrace();
			captureScreen(d, "TC8");
			throw new Exception();	

		}catch(AssertionError e) {
			e.printStackTrace();
			captureScreen(d, "TC8");
			throw new Exception();

		}
	}
}
