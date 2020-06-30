package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class SelectablePage {
	
	  WebDriver driver;
		
		Common_Methods cm= new Common_Methods();
			
			public  SelectablePage(WebDriver driver)
			{
				this.driver=driver;
				
			}
			
			@FindBy(how=How.XPATH,using="//*[text()='Item 1']")
			private WebElement item1_btn;
			@FindBy(how=How.XPATH,using="//*[text()='Item 2']")
			private WebElement item2_btn;
			@FindBy(how=How.XPATH,using="//*[text()='Item 3']")
			private WebElement item3_btn;
			@FindBy(how=How.XPATH,using="//*[text()='Item 4']")
			private WebElement item4_btn;
			@FindBy(how=How.XPATH,using="//*[text()='Item 5']")
			private WebElement item5_btn;
			@FindBy(how=How.XPATH,using="//*[text()='Item 6']")
			private WebElement item6_btn;
			@FindBy(how=How.XPATH,using="//*[text()='Item 7']")
			private WebElement item7_btn;
			
			public WebElement item1()
			{
				return item1_btn;
				
			}
			
			public WebElement item7()
			{
				return item7_btn;
				
			}
			
			public WebElement item2()
			{
				return item2_btn;
				
			}
			
			public WebElement item3()
			{
				return item3_btn;
				
			}
			
			public WebElement item4()
			{
				return item4_btn;
				
			}
			
			public WebElement item5()
			{
				return item5_btn;
				
			}
			
			public WebElement item6()
			{
				return item6_btn;
				
			}
			
			
			public void Select(WebElement ele,WebElement ele1)
			{
				cm.draganddrop(driver, ele, ele1);
				
			}

}
