package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class WaitToAppearPage {
	
	  WebDriver driver;
			Common_Methods cm= new Common_Methods();
			
			public  WaitToAppearPage(WebDriver driver)
			{
				this.driver=driver;		
			}
			
			@FindBy(how=How.XPATH,using="//button[@id='btn']//b[1]")
			private WebElement Appear_btn;
			
			public void appear()
			{
				
				cm.Waitforpresenceofelemet(driver, Appear_btn);
				System.out.println(Appear_btn.getText());
				cm.getScreenshot(driver, "Appear");
			}

}
