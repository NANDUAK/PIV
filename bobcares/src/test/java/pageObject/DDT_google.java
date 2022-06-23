package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DDT_google {

	WebDriver ld;

	public DDT_google(WebDriver rd)
	{
		ld=rd;
		PageFactory.initElements(rd, this);
	}

	@FindBy(name="q")
	WebElement SEARCH_FIELD;

	@FindBy(name="btnK")
	WebElement search_btn;




	public void searchgoogle(String AK)
	{
		SEARCH_FIELD.sendKeys(AK);
	}

	public void search_btnclick()
	{
		search_btn.click();
	}

}
