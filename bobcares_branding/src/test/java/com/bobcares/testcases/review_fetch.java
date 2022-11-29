package com.bobcares.testcases;

import java.awt.print.PrinterException;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class review_fetch {

	public String URL="https://www.trustpilot.com/review/bobcares.com";


	@Test
	public void f1() throws InterruptedException, PrinterException, IOException{

		System.setProperty("webdriver.gecko.driver",(System.getenv("GECKO_DRIVER")));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities. setCapability("marionette",true);
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless"); 
		options.addArguments("--incognito");
		FirefoxDriver d = new FirefoxDriver(options);

		d.get(URL);
		Thread.sleep(4000);

		Logger logger = Logger.getLogger("branding");
		PropertyConfigurator.configure("Log4j.properties");

		d.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(2000);;
		WebElement NumOfReviews=d.findElement(By.xpath("//p[@class='typography_body-l__KUYFJ typography_appearance-default__AAY17']"));
		String reviewNum=NumOfReviews.getText();
		System.out.println(reviewNum+ " Reviews");
		Thread.sleep(2000);
		WebElement rating= d.findElement(By.xpath("//p[@class='typography_body-l__KUYFJ typography_appearance-subtle__8_H2l']"));
		String reviewRating=rating.getText();
		System.out.println("Total rating on Trustpilot is "+ reviewRating);
		Thread.sleep(2000);
		d.findElement(By.xpath("(//p[@class='typography_heading-xxs__QKBS8 typography_appearance-inherit__D7XqR styles_label__wO2J_'])[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//label[@class='typography_default__hIMlQ typography_appearance-default__AAY17 styles_label__H7m0N'])[2]")).click();
		Thread.sleep(4000);
		
		
		for(int i=1;i<=18;++i){  
			
		//	for(int j=1;j<=i;j++){  

		//for (int j=1;j>0;j++)
	//	{

			String review= d.findElement(By.xpath("(//span[@class='typography_heading-xxs__QKBS8 typography_appearance-default__AAY17'])"+"["+i+"]")).getText();
		
			System.out.println(i+ ">" +review);
			System.out.println("--------------");
			
		//logger.info(i+ ">" +review);

		//for (int i=1;i<0;i++)			
			String revieww= d.findElement(By.xpath("(//p[@class='typography_body-l__KUYFJ typography_appearance-default__AAY17 typography_color-black__5LYEn'])"+"["+i+"]")).getText();
			System.out.println(revieww);
			//System.out.println("");
			//logger.info(revieww);
		}
		

}}



//String review= d.findElement(By.xpath("//p[@class='typography_body-l__KUYFJ typography_appearance-default__AAY17 typography_color-black__5LYEn']")).getText();
//System.out.println(review);


//	logger.info(review1);

//System.out.println(review=review1);



//			review = review.replaceAll("Share", "");
//			review = review.replaceAll("Useful", "");
// Trim the string using trim() method
//			review = review.trim();
// Printing the final string
//d.quit();



