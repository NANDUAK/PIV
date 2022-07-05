package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ServerManagement {
	
	WebDriver ld;
	
	public ServerManagement(WebDriver rd)
	{
		ld=rd;
		PageFactory.initElements(rd, this);
	}
		
	@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")
	WebElement servermangement_btn;
	
	@FindBy(xpath="//button[contains(text(),'I Agree')]")
	WebElement agree_button;
	
	
	@FindBy(xpath="//h1[contains(text(),'Server Management')]")
	WebElement servermanagemnt_text;
	
	@FindBy(xpath="//button[@id='monthly']")
	WebElement monthly_billing;	

	@FindBy(xpath="//button[@id='annually']")
	WebElement annualy_billing;	
	
	@FindBy(id="server-management-btn")
	WebElement price_button;

	@FindBy(id="servertwo")
	WebElement twoserver_btn;

	@FindBy(id="btnCompleteProductConfig")
	WebElement continue_btn;
	
	@FindBy(xpath="//strong[contains(text(),'Server Management - Server Monitoring & Management')]")
	WebElement reviewandcheckout_service_is;
	

	
	public void click_servermanagement_btn()
	{
		servermangement_btn.click();
	}
	
	public void agree_button_click()
	{
		 agree_button.click();
	}
	
	public String servermanagemnt_gettext()
	{
		return servermanagemnt_text.getText();
	}
	
	public void monthly_billing_click()
	{
		monthly_billing.click();
	}
	
	public void annualy_billing_click()
	{
		annualy_billing.click();
	}
	
	public void price_button_click()
	{
		price_button.click();
	}
	
	public void twoserver_btn_choose()
	{
		JavascriptExecutor js = (JavascriptExecutor)ld;
		js.executeScript("arguments[0].click();",twoserver_btn );
	}
	
	public void continue_btn_click()
	{
		continue_btn.click();
	}
	
	public String selectedService_Gettext()
	{
		return reviewandcheckout_service_is.getText();
	}
	
	
	
	
}
