package com.bobcares.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ServerManagement;

public class TC7_Ask_a_question extends base_class{
	@Test
	public void TC7() throws Exception {
		try{
			ServerManagement SM=new ServerManagement(d);
			Thread.sleep(3000);
			SM.click_servermanagement_btn();
			logger.info("click server management");
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollBy(0,4400)", "");
			Thread.sleep(3000);
			logger.info("scroll down");
			SM.ask_a_question_btnclick();
			Thread.sleep(5000);
			logger.info("click ask a question btn");


			String Actual="Now chatting";
			String Expected=SM.nowchattingfield_gettext();
			Assert.assertEquals(Actual, Expected);
			logger.info("test passed assert pass");

		}catch (Exception e) {
			e.printStackTrace();
			captureScreen(d, "TC7");
			throw new Exception();	

		}catch(AssertionError e) {
			e.printStackTrace();
			captureScreen(d, "TC7");
			throw new Exception();

		}}}