package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class editPage {
	
	WebDriver driver;
	
	Common_Methods cm= new Common_Methods();
	
	public  editPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement Email_btn;
	@FindBy(how=How.XPATH,using="//input[@value='Append ']")
	private WebElement Append_btn;
	@FindBy(how=How.XPATH,using="(//input[@name='username'])[1]")
	private WebElement getText_btn;
	@FindBy(how=How.XPATH,using="(//input[@name='username'])[2]")
	private WebElement clearText_btn;
	@FindBy(how=How.XPATH,using="//input[@disabled='true']")
	private WebElement Disable_btn;
	
	public void enterEmail()
	{
		cm.sleep(2000);
		Email_btn.sendKeys("abhignanakerekanti07@outlook.com");
		
	}
	
	public void append()
	{
		Append_btn.sendKeys("Hi");
	   
		
	}
	
	public void getText()
	{
		Append_btn.sendKeys(Keys.TAB);
		String value= getText_btn.getAttribute("value");
		System.out.println(value);
	}
	
	public void clearText()
	{
		clearText_btn.clear();
		
	}
	
	public void checkenablement()
	{
		
		if(Disable_btn.isEnabled()==false)
		{
			
			System.out.println("Field is Not Enabled");
		}
		
		else
		{
			System.out.println("Field is Disabled");
			
		}
	}
}
