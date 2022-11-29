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

	@FindBy(id="monthly")
	WebElement monthly_billing;	

	@FindBy(xpath="//button[@id='annually']")
	WebElement annualy_billing;	

	@FindBy(id="server-management-btn")
	WebElement price_button;

	@FindBy(xpath="//a[contains(text(),'$89/month')]")
	WebElement price_button_89$;

	@FindBy(xpath="//span[contains(text(),'$149/month')]")
	WebElement price_button_149;

	@FindBy(id="servertwo")
	WebElement twoserver_btn;

	@FindBy(id="btnCompleteProductConfig")
	WebElement continue_btn;

	@FindBy(id="btnCompleteProductConfig")
	WebElement continue_btn2;

	@FindBy(xpath="//strong[contains(text(),'Server Management - Server Monitoring & Management')]")
	WebElement reviewandcheckout_service_is;

	@FindBy(xpath="//tbody/tr[2]/td[1]/strong[1]")
	WebElement reviewandcheckout2_service_is;

	@FindBy(xpath="//a[contains(text(),'See all supported technologies')]")
	WebElement Seeallsupportedtechnologies;

	@FindBy(xpath="//h1[contains(text(),'Supported Technologies')]")
	WebElement supportedtechnologies;

	@FindBy(xpath="//body/div[@id='page-container']/div[@id='et-boc']/div[@id='et-main-area']/div[@id='main-content']/article[@id='post-99159']/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]")
	WebElement chatwithus_btn;

	@FindBy(xpath="//h2[contains(text(),'Now chatting')]")
	WebElement Nowchating_field;

	@FindBy(xpath="//a[contains(text(),'ASK A QUESTION')]")
	WebElement askaquestionbtn;

	@FindBy(xpath="//button[@id='gform_submit_button_1']")
	WebElement submit_btn;

	@FindBy(xpath="//a[contains(text(),'Name: This field is required. Please complete the ')]")
	WebElement name_field_error;

	@FindBy(xpath="//a[contains(text(),'Email: This field is required.')]")
	WebElement email_field_error;

	
	
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

		//JavascriptExecutor js = (JavascriptExecutor)ld;
		//js.executeScript("arguments[0].click();",monthly_billing );
	}

	public void annualy_billing_click()
	{
		annualy_billing.click();
	}

	public void price_button_click()
	{
		price_button.click();
	}


	public void price_button_89_click()
	{
		price_button_89$.click();
	}

	public void price_button_149_click()
	{
		price_button_149.click();
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

	public void continue_btn2_click()
	{
		continue_btn2.click();
	}

	public String selectedService_Gettext()
	{
		return reviewandcheckout_service_is.getText();
	}

	public String selectedService2_Gettext()
	{
		return reviewandcheckout2_service_is.getText();
	}
	public String  supportedtechnologies_gettext() {

		return supportedtechnologies.getText();
	}

	public void Seeallsupportedtechnologies_click() {

		Seeallsupportedtechnologies.click();

	}

	public void chatwithus_btn_click() {

		chatwithus_btn.click();
	}


	public String nowchattingfield_gettext()

	{
		return Nowchating_field.getText();
	}

	public void ask_a_question_btnclick() 
	{
		askaquestionbtn.click();
	}

	public void submit_btn_click()
	{
		submit_btn.click();

	}
	
	public String  Namefield_error_gettext() {

		return name_field_error.getText();
	}

	
	public String  Emailfield_error_gettext() {

		return email_field_error.getText();
	}


}




