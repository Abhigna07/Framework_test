package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class CheckBoxPage {
	
	WebDriver driver;
	
Common_Methods cm= new Common_Methods();
	
	public  CheckBoxPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[1]")
	private WebElement Java_btn;
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[2]")
	private WebElement VB_btn;
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[3]")
	private WebElement SQL_btn;
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[4]")
	private WebElement C_btn;
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[5]")
	private WebElement Cplus_btn;
	@FindBy(how=How.XPATH,using="(//label[text()='Confirm Selenium is checked']/following::input)[1]")
	private WebElement Check_btn;
	@FindBy(how=How.XPATH,using="(//label[text()='DeSelect only checked']/following::input)[1]")
	private WebElement Check1_btn;
	@FindBy(how=How.XPATH,using="(//label[text()='DeSelect only checked']/following::input)[2]")
	private WebElement Check2_btn;
	@FindBy(how=How.XPATH,using="(//label[text()='Select all below checkboxes ']/following::input)[1]")
	private WebElement opt1_btn;
	@FindBy(how=How.XPATH,using="(//label[text()='Select all below checkboxes ']/following::input)[2]")
	private WebElement opt2_btn;
	@FindBy(how=How.XPATH,using="(//label[text()='Select all below checkboxes ']/following::input)[3]")
	private WebElement opt3_btn;
	@FindBy(how=How.XPATH,using="(//label[text()='Select all below checkboxes ']/following::input)[4]")
	private WebElement opt4_btn;
	@FindBy(how=How.XPATH,using="(//label[text()='Select all below checkboxes ']/following::input)[5]")
	private WebElement opt5_btn;
	
	public void select_languages()
	{
		Java_btn.click();
		VB_btn.click();
		SQL_btn.click();
		C_btn.click();	
		Cplus_btn.click();
	}
	
	public void confirm_check()
	{
		Boolean val= Check_btn.isSelected();
		System.out.println("Selenium button is enabled? "+ val);
		
	}
	
	public void Check_Uncheck()
	{
		Boolean val1= Check1_btn.isSelected();
		boolean val2=Check2_btn.isSelected();
		
		cm.sleep(3000);
		if(val1==true)
		{
			cm.sleep(3000);
			Check1_btn.click();
			
		}
		
		if(val2==true)
		{
			cm.sleep(3000);
			Check2_btn.click();
			
		}
		
		
	}
	
	public void selectAll()
	{
		opt1_btn.click();
		opt2_btn.click();
		opt3_btn.click();
		opt4_btn.click();
		opt5_btn.click();
		
	}


}
