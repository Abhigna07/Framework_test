package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test_cases.Common_Methods;

public class DraggablePage {
	
WebDriver driver;
	
	
	Common_Methods cm= new Common_Methods();
		
		public  DraggablePage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		@FindBy(how=How.ID,using="draggable")
		private WebElement drags_btn;
		
		public void drag(int xOffset, int yOffset)
		{
			cm.draganddropby(driver, drags_btn, xOffset, yOffset);
			
		}

}
