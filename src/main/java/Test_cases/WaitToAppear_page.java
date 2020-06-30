package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.WaitToAppearPage;
import Pages.mainPage;

public class WaitToAppear_page extends baseClass{
  @Test
  public void WaitToAppearpage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_WaitToappear();
	  WaitToAppearPage apppage= PageFactory.initElements(driver, WaitToAppearPage.class);
	  apppage.appear();
  }
}
