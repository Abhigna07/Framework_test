package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class WaitForAlertPage {
	
	   WebDriver driver;
	   Common_Methods cm= new Common_Methods();
		
		public  WaitForAlertPage(WebDriver driver)
		{
			this.driver=driver;		
		}
		
		@FindBy(how=How.ID,using="alert")
		private WebElement Alert_btn;
		
		public void alertpresenttest()
		{
			Alert_btn.click();
			cm.alertcheck(driver);
			Alert al= driver.switchTo().alert();
			String Val=al.getText();
			System.out.println(Val);
			al.accept();
			
		}

}
