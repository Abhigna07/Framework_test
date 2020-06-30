package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class radioPage {
	

	WebDriver driver;
	
Common_Methods cm= new Common_Methods();
	
	public  radioPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.ID,using="yes")
	private WebElement yes_btn;
	@FindBy(how=How.ID,using="no")
	private WebElement no_btn;
	@FindBy(how=How.XPATH,using="(//input[@name='news'])[1]")
	private WebElement check_btn;
	@FindBy(how=How.XPATH,using="(//input[@name='news'])[2]")
	private WebElement uncheck_btn;
	@FindBy(how=How.XPATH,using="(//input[@name='age'])[1]")
	private WebElement age_btn;
	
	public void choice()
	{
		yes_btn.click();
		no_btn.click();
		
	}
	
	public void finddefault()
	{
		
		boolean val1=check_btn.isSelected();
		boolean val2=uncheck_btn.isSelected();
		
		System.out.println("element one select status is : "+val1);
		System.out.println("element two select status is : "+val2);
		
		
	}
	
	public void select_age()
	{
		
		age_btn.click();
	}

}
