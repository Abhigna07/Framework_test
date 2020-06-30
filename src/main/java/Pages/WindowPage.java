package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class WindowPage {
	
	WebDriver driver;
	
	
	Common_Methods cm= new Common_Methods();
		
		public  WindowPage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		@FindBy(how=How.ID,using="home")
		private WebElement Home_btn;
		@FindBy(how=How.XPATH,using="//button[text()='Open Multiple Windows']")
		private WebElement MulWin_btn;
		@FindBy(how=How.XPATH,using="//button[text()='Do not close me ']")
		private WebElement Close_btn;
		@FindBy(how=How.XPATH,using="//button[text()='Wait for 5 seconds']")
		private WebElement wait_btn;
		
		public void homepage()
		{
			
		Home_btn.click();	
		String main_page=driver.getWindowHandle();
		Set<String> window_hand= driver.getWindowHandles();
		for(String i:window_hand)
		{			
			if(!(i.equals(main_page)))
			
			{				
				driver.switchTo().window(i).close();					
			}			

		}
		
		driver.switchTo().window(main_page);
			
		}
		
		public void findnumberofwindows()
		{
			MulWin_btn.click();
			String main_page=driver.getWindowHandle();
			Set<String> window_hand= driver.getWindowHandles();
			System.out.println("Number of window handles are : "+window_hand.size());
			for(String i:window_hand)
			{
			if(!(i.equals(main_page)))
				
			{				
				driver.switchTo().window(i).close();					
			}
			
		}
			
			driver.switchTo().window(main_page);
			
		}
		
		public void waitforwindows(int windows)
		{
			
			wait_btn.click();
			String main_page=driver.getWindowHandle();
			cm.waitforwindows(driver,windows);
			Set<String> window_hand= driver.getWindowHandles();
			System.out.println("Number of window handles are : "+window_hand.size());
			for(String i:window_hand)
			{
			if(!(i.equals(main_page)))
				
			{				
				driver.switchTo().window(i).close();					
			}
			
		}
			
			driver.switchTo().window(main_page);
			
		}
			
	public void closeotherthanhome()
	{
		Close_btn.click();
		String main_page=driver.getWindowHandle();
		Set<String> window_hand= driver.getWindowHandles();
		for(String i:window_hand)
		{
		if(i.equals(main_page))
			
		{				
			driver.switchTo().window(i).close();					
		}
		
	}
		

	}
	
}
