package com.bobcares.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ServerManagement;



public class TC1 extends base_class{

	@Test
	public void tc1() throws Exception 
	{
		d.get(baseURL);	
		logger.info("URL is opened");
		try {
		ServerManagement SM=new ServerManagement(d);
		SM.click_servermanagement_btn();
		String Actual="Server Management";
		String Expected=SM.servermanagemnt_gettext();
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
		
	}}
