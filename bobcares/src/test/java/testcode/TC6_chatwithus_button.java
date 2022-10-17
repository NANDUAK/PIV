package testcode;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ServerManagement;

public class TC6_chatwithus_button extends base_class{
	@Test
	public void TC6() throws Exception {
	try{
		ServerManagement SM=new ServerManagement(d);
		Thread.sleep(3000);
		SM.click_servermanagement_btn();
		logger.info("click server management");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,3400)", "");
		Thread.sleep(3000);
		logger.info("scroll down");
		SM.chatwithus_btn_click();
		Thread.sleep(5000);
		logger.info("click chat with us btn");
		
		
		String Actual="Now chatting";
		String Expected=SM.nowchattingfield_gettext();
		Assert.assertEquals(Actual, Expected);
		logger.info("test passed assert pass");


	}catch (Exception e) {
		e.printStackTrace();
		captureScreen(d, "TC6");
		throw new Exception();	

	}catch(AssertionError e) {
		e.printStackTrace();
		captureScreen(d, "TC6");
		throw new Exception();
	
}}}