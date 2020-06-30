package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class DroppablePage {
	
    WebDriver driver;
		
	Common_Methods cm= new Common_Methods();
		
		public  DroppablePage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		@FindBy(how=How.ID,using="draggable")
		private WebElement drags_btn;
		@FindBy(how=How.ID,using="droppable")
		private WebElement drops_btn;
		@FindBy(how=How.XPATH,using="//div[contains(@class,'ui-widget-header ui-droppable')]//p[1]")
		private WebElement Cnfs_btn;
		
		public void Draganddrop()
		{
			cm.draganddrop(driver, drags_btn, drops_btn);
			System.out.println( "Is button dropped? " + Cnfs_btn.getText());
		}

}
