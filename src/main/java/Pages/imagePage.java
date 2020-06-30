package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import Test_cases.Common_Methods;

public class imagePage {
	
	WebDriver driver;
	String actual="TestLeaf - Selenium Playground";
		
		Common_Methods cm= new Common_Methods();
		
		public  imagePage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		@FindBy(how=How.XPATH,using="//img[@src='../images/home.png']")
		private WebElement home_btn;
		@FindBy(how=How.XPATH,using="//img[@src='../images/abcd.jpg']")
		private WebElement broken_btn;
		@FindBy(how=How.XPATH,using="//img[@src='../images/keyboard.png']")
		private WebElement keyboard_btn;
		
		public void homepage(String path)
		
		{
			cm.sleep(3000);
			cm.brokenImage(home_btn);
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
		
		public void broken_imagecheck()
		{
			cm.brokenImage(broken_btn);
			
		}
		
		
		public void mouseInteraction(String path)
		{
			
			cm.mouseclick(driver, keyboard_btn);
	        String expected= driver.getTitle();
			
			if(actual.equals(expected))
			{
			cm.getScreenshot(driver, path);
			
			}
			
			
			else {
				
				Assert.fail("Test Failed");
						
			}
			
		}	
}
