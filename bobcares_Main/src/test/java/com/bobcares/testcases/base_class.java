package com.bobcares.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.bobcares.utils.ReadConfig;


public class base_class {

	ReadConfig readconfig=new ReadConfig();

	public String baseURL=readconfig.getApplicationURL();
	public String URL=readconfig.getApplicationURL2();
	public static WebDriver d;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException
	{			
		logger = Logger.getLogger("ecommerce");
		PropertyConfigurator.configure("Log4j.properties");

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			ChromeOptions options = new ChromeOptions();  
			//options.setHeadless(true); //Set Chrome option
			d=new ChromeDriver(options);
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities. setCapability("marionette",true);
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--headless"); 
			options.addArguments("--incognito");
			d = new FirefoxDriver(options);
		}

		d.get(baseURL);	
		d.manage().window().maximize();
	}

	@AfterClass
	public void tearDown()
	{
		d.quit();
	}

	public void captureScreen(WebDriver d, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE); 
		File target = new File(System.getProperty("user.dir") + "/Screenshot/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
