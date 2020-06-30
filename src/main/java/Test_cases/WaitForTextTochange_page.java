package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.WaitForTexttochangePage;
import Pages.mainPage;

public class WaitForTextTochange_page extends baseClass {
  @Test
  public void WaitForTextTochangepage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_WaitForTextChange();
	  WaitForTexttochangePage tchangepage= PageFactory.initElements(driver, WaitForTexttochangePage.class);
	  tchangepage.Text_change();
	  
  }
}
