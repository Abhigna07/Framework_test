package Pages;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import Test_cases.Common_Methods;

public class buttonPage {

WebDriver driver;
String actual="TestLeaf - Selenium Playground";
	
	Common_Methods cm= new Common_Methods();
	
	public  buttonPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.ID,using="home")
	private WebElement home_btn;
	@FindBy(how=How.ID,using="position")
	private WebElement psitn_btn;
	@FindBy(how=How.ID,using="color")
	private WebElement clr_btn;
	@FindBy(how=How.ID,using="size")
	private WebElement sz_btn;
	
	public void homepageCheck(String path)
	{
		cm.sleep(3000);
		
		home_btn.click();
		
		String expected= driver.getTitle();
		
		if(actual.equals(expected))
		{
		cm.getScreenshot(driver, path);
		
		}
		
		
		else {
			
			Assert.fail("Test Failed");
					
		}				
	
	}
	
	public void position()
	{
		
	Point p=psitn_btn.getLocation();
	System.out.println("Location is : "+p);
							
	}
	
	public void color()
	{
		
		String clr=clr_btn.getCssValue("background-color");
		System.out.println("Colour is : "+clr);
		
	}
	
	
	public void dimensions()
	{
		
	Dimension dim=sz_btn.getSize();
	System.out.println("Dimensions of button are : "+dim);
		
	}
	
}
