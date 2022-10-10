package com.bobcares.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bobcares.utils.ExcelDataSupplier;

public class branding extends base_class  {
	@Test(dataProvider = "data1",dataProviderClass = ExcelDataSupplier.class)
	public void tc2(String URL, String passwd) throws InterruptedException  {
		int i;
		for(i=0;i<1;i++)
		{
			d.get(URL);

			Thread.sleep(2000);
			d.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='top_nav']/div[@id='hdtb']/div[@id='pTwnEc']/div[@id='hdtb-msb']/div[1]/span[1]/g-popup[1]/div[1]/div[1]")).click();
			Thread.sleep(2000);
//			d.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(")DdZynC3gc1XCz&p)ytS09Pu");
//			Thread.sleep(2000);
//			d.findElement(By.xpath("//input[@id='wp-submit']")).click();
//			Thread.sleep(8000);
//			d.findElement(By.xpath("//span[contains(text(),'Insights')]")).click();
//			Thread.sleep(5000);
//			System.out.println(d.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[3]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[13]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]")).getText());
//			Thread.sleep(4000);
		}

	}
}

