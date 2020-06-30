package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.WaitToDisappearPage;
import Pages.mainPage;

public class WaitToDisappear_page extends baseClass {
  @Test
  public void WaitToDisaapearpage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_WaitToDisappear();
	  WaitToDisappearPage dispage= PageFactory.initElements(driver, WaitToDisappearPage.class);
	  dispage.disappear();
  }
}
