package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import Test_cases.Common_Methods;

public class hyperLinksPage {
	
	
	WebDriver driver;
	String actual="TestLeaf - Selenium Playground";
		
		Common_Methods cm= new Common_Methods();
		
		
		public  hyperLinksPage(WebDriver driver)
		{
			this.driver=driver;			
		}	

		@FindBy(how=How.XPATH,using="(//a[@href='../home.html'])[2]")
		private WebElement home_btn;
		@FindBy(how=How.LINK_TEXT,using="Find where am supposed to go without clicking me?")
		private WebElement CHECK_btn;
		@FindBy(how=How.LINK_TEXT,using="Verify am I broken?")
		private WebElement VERIFY_btn;
		@FindBy(how=How.XPATH,using="(//a[@href='../home.html'])[3]")
		private WebElement GOTO_btn;
		@FindBy(how=How.TAG_NAME,using="a")
		private List<WebElement> listoflinks;
		
		
		public void Homepage(String path)
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
		

		public void findurl()
		{
			cm.sleep(3000);
			String url=CHECK_btn.getAttribute("href");
			 cm.brokenLink(url);
			System.out.println("driver moved to URL : "+url);
			
		}
		
		
		public void checkbroken()
		{
			
          String URL= VERIFY_btn.getAttribute("href");
		  cm.brokenLink(URL);								
		}
		
		public void interact()
		{
			
			GOTO_btn.click();			
			
		}
		
		public void numberoflinks()
		{
			
			System.out.println("Number of links are : "+listoflinks.size());
			
		}
}
