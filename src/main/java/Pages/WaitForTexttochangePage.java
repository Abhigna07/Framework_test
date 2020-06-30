package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class WaitForTexttochangePage {
	
	  WebDriver driver;
		Common_Methods cm= new Common_Methods();
		
		public  WaitForTexttochangePage(WebDriver driver)
		{
			this.driver=driver;		
		}
		
		@FindBy(how=How.XPATH,using="//button[text()='Click ME!']")
		private WebElement Text_btn;
		
		public void Text_change()
		{
			cm.Waitforpresenceofelemet(driver, Text_btn);
			Text_btn.click();
			Alert al= driver.switchTo().alert();
			String val=al.getText();
			al.accept();
			System.out.println(val);
			
		}

}
