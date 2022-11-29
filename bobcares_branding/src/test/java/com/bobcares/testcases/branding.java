package com.bobcares.testcases;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import com.bobcares.utils.ExcelDataSupplier;

public class branding {

	public WebDriver d;
	public String out_1;

	@Test(dataProvider = "data1",dataProviderClass = ExcelDataSupplier.class)
	public void f1(String URL,String passwd) throws InterruptedException, IOException  {

		System.setProperty("webdriver.gecko.driver",(System.getenv("GECKO_DRIVER")));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities. setCapability("marionette",true);
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless"); 
		options.addArguments("--incognito");
		FirefoxDriver d = new FirefoxDriver(options);
        //login URL
		d.get(URL);
		Thread.sleep(4000);


		Logger logger = Logger.getLogger("branding");
		PropertyConfigurator.configure("Log4j.properties");

		Thread.sleep(4000);
		//ENTER CREDENTIALS
		d.findElement(By.xpath("//input[@id='user_login']")).sendKeys("bobUS");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("9L7MDE0heWffrI5g-o-sN#.S");
		Thread.sleep(2000);
		//CLICK ON SUBMIT
		d.findElement(By.xpath("//input[@id='wp-submit']")).click();
		Thread.sleep(8000);
		{
			//CHECK POP-UP CONDITION
			if	(!d.findElements(By.xpath("(//button[@class='components-button has-icon'])[7]")).isEmpty())	
			{
				Thread.sleep(5000);
				d.findElement(By.xpath("(//button[@class='components-button has-icon'])[7]")).click();
				Thread.sleep(2000);
				d.findElement(By.xpath("//span[contains(text(),'Insights')]")).click();
				Thread.sleep(5000);
				//FETCH SCORE
				String score_1=(d.findElement(By.xpath("(//span[@class='yoast-insights-card__amount'])[1]"))).getText();			
				//score.getText();
				System.out.println(score_1);
				Thread.sleep(2000);
				String url_1=d.getCurrentUrl();
				String out_1=( url_1 + "," + score_1);
				System.out.println(out_1);
				logger.info(out_1);
				Thread.sleep(3000);						
				d.quit();
			}	
			else 
			{
				System.out.println("POP-UP ABSENT");
				d.findElement(By.xpath("//span[contains(text(),'Insights')]")).click();
				Thread.sleep(5000);
				String score_2=(d.findElement(By.xpath("(//span[@class='yoast-insights-card__amount'])[1]"))).getText();
				//	score.getText();
				System.out.println(score_2);
				String url=	d.getCurrentUrl();
				Thread.sleep(2000);
				String out_1= ( url + "," + score_2);
				System.out.println(out_1);	
				logger.info(out_1);
				Thread.sleep(3000);
				d.quit();	}
		}}}




