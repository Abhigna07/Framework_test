package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class AlertPage {
	
	WebDriver driver;
	
	
Common_Methods cm= new Common_Methods();
	
	public  AlertPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Alert Box']")
	private WebElement Alert_btn;
	@FindBy(how=How.XPATH,using="//button[text()='Confirm Box']")
	private WebElement Cnf_btn;
	@FindBy(how=How.XPATH,using="//button[text()='Prompt Box']")
	private WebElement prmpt_btn;
	@FindBy(how=How.XPATH,using="//button[text()='Line Breaks?']")
	private WebElement line_btn;
	@FindBy(how=How.ID,using="btn")
	private WebElement Swt_btn;
	@FindBy(how=How.ID,using="result")
	private WebElement res_btn;
	@FindBy(how=How.ID,using="result1")
	private WebElement res1_btn;
	
	
	public void Alert_box()
	{	
		cm.sleep(3000);
		Alert_btn.click();
	    Alert al=driver.switchTo().alert();
	    al.accept();		
	}
	
	public void confirm_box()
	{
		
		Cnf_btn.click();
	    Alert al=driver.switchTo().alert();
	    al.dismiss();
	    System.out.println(res_btn.getText());
	}
	
	public void prompt_box(String course)
	{
		prmpt_btn.click();
	    Alert al=driver.switchTo().alert();
	    al.sendKeys(course);
	    al.accept();
	    System.out.println(res1_btn.getText());
		
	}
	
	public void linebreaktext()
	{
		line_btn.click();
	    Alert al=driver.switchTo().alert();
	    System.out.println(al.getText());
	    al.accept();
		
	}
	
	public void SweetAlert()
	{
		Swt_btn.click();
	    driver.switchTo().activeElement().click();	
		
	}

}
