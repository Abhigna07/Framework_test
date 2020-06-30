package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class WaitToDisappearPage {
	
	    WebDriver driver;
		Common_Methods cm= new Common_Methods();
		
		public  WaitToDisappearPage(WebDriver driver)
		{
			this.driver=driver;		
		}
		
		@FindBy(how=How.XPATH,using="//strong[text()[normalize-space()='I know you can do it! Button is disappeared!']]")
		private WebElement Appear_btn;
		
		public void disappear()
		{
			cm.Waitforpresenceofelemet(driver, Appear_btn);
			cm.getScreenshot(driver, "Disappear");
			
		}
		
	    

}
