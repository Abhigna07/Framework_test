package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.WaitForAlertPage;
import Pages.mainPage;

public class WaitForAlert_page extends baseClass {
  @Test
  public void WaitForAlertpage() {
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_WaitForAlert();
	  WaitForAlertPage wapage= PageFactory.initElements(driver, WaitForAlertPage.class);
	  wapage.alertpresenttest();
  }
}
