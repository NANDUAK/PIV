package pageObject;

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
	
	@FindBy(xpath="//h1[contains(text(),'Server Management')]")
	WebElement servermanagemnt_text;
	
	 
	
	
	public void click_servermanagement_btn()
	{
		servermangement_btn.click();
	}
	
	public String servermanagemnt_gettext()
	{
		return servermanagemnt_text.getText();
	}
	
	
	
	
	
}
