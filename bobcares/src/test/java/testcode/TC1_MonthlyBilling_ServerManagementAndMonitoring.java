package testcode;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ServerManagement;

public class TC1_MonthlyBilling_ServerManagementAndMonitoring extends base_class{
	@Test
	public  void TC_1() throws Exception {
		logger.info("URL is opened");
//		
//		Thread.sleep(2000);
//		d.findElement(By.id("home-banner-bob-sec")).click();
//		Thread.sleep(4000);
//		d.findElement(By.xpath("//button[contains(text(),'I Agree')]")).click();
		
		try {
			ServerManagement SM=new ServerManagement(d);
			Thread.sleep(5000);
			SM.click_servermanagement_btn();
			Thread.sleep(3000);
			logger.info("click server management");				 
//			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(120));
//			wait.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//span[contains(text(),'Chat with us')]")));
//			WebElement l=d.findElement(By.xpath("//span[contains(text(),'Chat with us')]"));
//			l.getText();
//			System.out.println("element present"+l);
			d.findElement(By.id("monthly")).click();
			Thread.sleep(3000);
			logger.info("click monthly billing");
			Thread.sleep(4000);
			SM.price_button_click();
			logger.info("click price button");
			Thread.sleep(4000);		
			SM.twoserver_btn_choose();
			logger.info("choose 2 servers");
			Thread.sleep(4000);	
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




