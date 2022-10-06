package com.bobcares.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ServerManagement;

public class TC4_YearlyBilling_LimitelessServerManagement extends base_class{
  @Test
  public void TC4() throws Exception {
		try {
			ServerManagement SM=new ServerManagement(d);
			Thread.sleep(5000);
			SM.click_servermanagement_btn();
			logger.info("click server management");
//			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(120));
//			wait.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//span[contains(text(),'Chat with us')]")));
//			WebElement l=d.findElement(By.xpath("//span[contains(text(),'Chat with us')]"));
//			l.getText();
//			System.out.println("element present"+l);
			SM.annualy_billing_click();
			logger.info("click annual billing");
			Thread.sleep(4000);
			SM.price_button_89_click();
			logger.info("click price_89 button");
			Thread.sleep(4000);	
			//			SM.continue_btn2_click();
			//			logger.info("click on continue");
			Thread.sleep(5000);


			String Actual="Server Management - Limitless Server Management Yearly";
			String Expected=SM.selectedService2_Gettext();
			Assert.assertEquals(Actual, Expected);
			logger.info("test passed assert pass");


		}catch (Exception e) {
			e.printStackTrace();
			captureScreen(d, "TC3");
			throw new Exception();	

		}catch(AssertionError e) {
			e.printStackTrace();
			captureScreen(d, "TC3");
			throw new Exception();	
		}
	}

	  
  }
