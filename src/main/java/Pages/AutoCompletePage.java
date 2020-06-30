package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class AutoCompletePage {
	

	  WebDriver driver;
		
			Common_Methods cm= new Common_Methods();
				
				public  AutoCompletePage(WebDriver driver)
				{
					this.driver=driver;
					
				}
				
				@FindBy(how=How.ID,using="tags")
				private WebElement Text_btn;
				
				public void entervalue(String text)
				{
					Text_btn.sendKeys(text);
					cm.sleep(2000);
					Text_btn.sendKeys(Keys.ARROW_DOWN);
					Text_btn.sendKeys(Keys.ENTER);
				}

}
