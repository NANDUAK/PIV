package com.bobcares.testcases;

import org.testng.annotations.Test;

import com.bobcares.utils.ExcelDataSupplier;

import pageObject.DDT_google;

public class DDT_TC extends base_class {
	@Test(dataProvider = "data1",dataProviderClass = ExcelDataSupplier.class)
	public void tc2(String USER, String PASSWORD) throws InterruptedException  {
        d.get(URL);
		logger.info("URL is opened");
		DDT_google tc=new DDT_google(d);
		tc.searchgoogle(USER);
		Thread.sleep(2000);;
		tc.searchgoogle(PASSWORD);
		Thread.sleep(1000);
		tc.search_btnclick();
		d.navigate().back();
		



	}
}