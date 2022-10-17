package testcode;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ServerManagement;

public class TC5_supported_techologies_link extends base_class {
	@Test
	public void TC5() throws Exception {
		try {
			ServerManagement SM=new ServerManagement(d);
			Thread.sleep(3000);
			SM.click_servermanagement_btn();
			logger.info("click server management");
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollBy(0,3400)", "");
			Thread.sleep(3000);
			logger.info("scroll down");
			SM.Seeallsupportedtechnologies_click();
			Thread.sleep(5000);
			logger.info("click see all supported tech link");


			String Actual=d.getCurrentUrl();
			String Expected="https://bobcares.com/supported-technologies/";
			Assert.assertEquals(Actual, Expected);
			logger.info("test passed assert pass");


		}catch (Exception e) {
			e.printStackTrace();
			captureScreen(d, "TC5");
			throw new Exception();	

		}catch(AssertionError e) {
			e.printStackTrace();
			captureScreen(d, "TC5");
			throw new Exception();
		}
		}
	}