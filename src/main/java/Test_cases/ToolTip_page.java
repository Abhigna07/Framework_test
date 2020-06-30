package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.ToolTipPage;
import Pages.mainPage;

public class ToolTip_page extends baseClass {
  @Test
  public void ToolTippage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_ToolTip();
	  ToolTipPage ttpage= PageFactory.initElements(driver, ToolTipPage.class);
	  ttpage.hover();
  }
}
