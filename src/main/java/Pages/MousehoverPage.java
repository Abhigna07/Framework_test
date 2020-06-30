package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class MousehoverPage {
	  WebDriver driver;
	   Common_Methods cm= new Common_Methods();
		
		public  MousehoverPage(WebDriver driver)
		{
			this.driver=driver;		
		}
		
		@FindBy(how=How.LINK_TEXT,using="TestLeaf Courses")
		private WebElement Mousehover_btn;
		@FindBy(how=How.LINK_TEXT,using="Selenium")
		private WebElement sel_btn;
		@FindBy(how=How.LINK_TEXT,using="RPA")
		private WebElement rp_btn;
		@FindBy(how=How.LINK_TEXT,using="WebServices")
		private WebElement WS_btn;
		
		public void printlinks()
		{
			
			cm.hoveronelement(driver, Mousehover_btn);
			cm.hoveronelement(driver, sel_btn);
			System.out.println(sel_btn.getText());
			cm.hoveronelement(driver, rp_btn);
			System.out.println(rp_btn.getText());
			cm.hoveronelement(driver, WS_btn);
			System.out.println(WS_btn.getText());				
		}
		
		public void selenium_alert()
		{
			cm.hoveronelement(driver, Mousehover_btn);
			cm.hoveronelement(driver, sel_btn);
			sel_btn.click();
			Alert al= driver.switchTo().alert();
			al.accept();			
		}
		
		public void rp_alert()
		{
			cm.hoveronelement(driver, Mousehover_btn);
			cm.hoveronelement(driver, rp_btn);
			rp_btn.click();
			Alert al= driver.switchTo().alert();
			al.accept();			
		}
		
		public void WS_alert()
		{
			cm.hoveronelement(driver, Mousehover_btn);
			cm.hoveronelement(driver, WS_btn);
			WS_btn.click();
			Alert al= driver.switchTo().alert();
			al.accept();			
		}

}
