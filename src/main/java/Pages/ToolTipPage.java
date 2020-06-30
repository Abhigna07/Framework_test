package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class ToolTipPage {
	
	 WebDriver driver;
	Common_Methods cm= new Common_Methods();
	
	public  ToolTipPage(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	@FindBy(how=How.ID,using="age")
	private WebElement Text_btn;
    @FindBy(how=How.CLASS_NAME,using="ui-tooltip-content")
	private WebElement tool_btn;
	
	public void hover()
	{
		Text_btn.click();
		cm.Waitforpresenceofelemet(driver, tool_btn);
		cm.getScreenshot(driver, "tooltip");
		
	}
	

}
