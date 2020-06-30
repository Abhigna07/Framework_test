package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Test_cases.Common_Methods;

public class CalenderPage {
WebDriver driver;
	
	
	Common_Methods cm= new Common_Methods();
		
		public  CalenderPage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		@FindBy(how=How.ID,using="datepicker")
		private WebElement calender_btn;
		@FindBy(how=How.XPATH,using="//span[text()='Next']")
		private WebElement next_btn;
		@FindBy(how=How.XPATH,using="//span[text()='Prev']")
		private WebElement prev_btn;
		@FindBy(how=How.CLASS_NAME,using="ui-datepicker-year")
		private WebElement year_btn;
		@FindBy(how=How.CLASS_NAME,using="ui-datepicker-month")
		private WebElement month_btn;
		
		public void forward_dateselection(String month, String year,int date)
		{
			calender_btn.click();
										
			
			for(int i=1;i<=100;i++)
			{
				String ele1= year_btn.getText();
				
				if(ele1.equals(year))
				{
				 
					break;
					
				}
				
				else
				{
					next_btn.click();
					
				}
			}
				
				for(int i=1;i<=100;i++)
				{
					String ele= month_btn.getText();
					WebElement e= driver.findElement(By.linkText(""+date+""));
					if(ele.equalsIgnoreCase(month))
					{
						    e.click();
							break;
					}
																
					else
					{
						
						next_btn.click();
					}
					
				}			
		}	
		
		public void previous_dateselection(String month, String year,int date)
		{
			calender_btn.click();
			
			for(int i=100;i>=1;i--)
			{
				String ele1= year_btn.getText();
				
				if(ele1.equals(year))
				{
				 
					break;
					
				}
				
				else
				{
					prev_btn.click();
					
				}
			}
				
				for(int i=100;i>=1;i--)
				{
					String ele= month_btn.getText();
					WebElement e= driver.findElement(By.linkText(""+date+""));
					if(ele.equalsIgnoreCase(month))
					{
						    e.click();
							break;
					}
																
					else
					{
						
						prev_btn.click();
					}
					
				}			
		
			
			
		}

}
