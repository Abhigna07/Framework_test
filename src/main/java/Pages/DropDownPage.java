package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import Test_cases.Common_Methods;

public class DropDownPage {
	
	
	WebDriver driver;
	
Common_Methods cm= new Common_Methods();
	
	public  DropDownPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.ID,using="dropdown1")
	private WebElement Drop1_btn;
	@FindBy(how=How.NAME,using="dropdown2")
	private WebElement Drop2_btn;
	@FindBy(how=How.ID,using="dropdown3")
	private WebElement Drop3_btn;
	@FindBy(how=How.CLASS_NAME,using="dropdown")
	private WebElement options_btn;
	@FindBy(how=How.XPATH,using="(//div[@class='example']//select)[5]")
	private WebElement send_btn;
	@FindBy(how=How.XPATH,using="//option[@disabled='true']/following-sibling::option[1]")
	private WebElement sel_btn;
	@FindBy(how=How.XPATH,using="//div[@id='contentblock']/section[1]/div[6]/select[1]/option[3]")
	private WebElement App_btn;
	@FindBy(how=How.XPATH,using="//div[@id='contentblock']/section[1]/div[6]/select[1]/option[4]")
    private WebElement QU_btn;
	@FindBy(how=How.XPATH,using="//div[@id='contentblock']/section[1]/div[6]/select[1]/option[5]")
    private WebElement Load_btn;
	
	public void select_index(int index)
	{		
		Select sel =  new Select(Drop1_btn);
		sel.selectByIndex(index);	
		
	}
	
	public void select_Text(String text)
	{
		Select sel =  new Select(Drop2_btn);
		sel.selectByVisibleText(text);
		
	}
	
	public void select_Value(String value)
	{
		Select sel =  new Select(Drop3_btn);
		sel.selectByValue(value);
		
	}
	
	public void getnumberofoptions()
	{
		Select sel =  new Select(options_btn);
		int options=sel.getOptions().size();
		System.out.println("No:of options are : "+ options);
		List<WebElement> e = sel.getOptions();
		for(int i = 0; i < options; i++)
		{
		    System.out.println(e.get(i).getText());
		}
		
	}
	
	public void sendtext(String text)
	{
	
		send_btn.sendKeys(text);
	}
	
	public void select()
	{
		sel_btn.click();
		App_btn.click();
		QU_btn.click();
		Load_btn.click();
	}
	

}
