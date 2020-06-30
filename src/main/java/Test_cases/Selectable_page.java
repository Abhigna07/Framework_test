package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.SelectablePage;
import Pages.mainPage;

public class Selectable_page extends baseClass {
  @Test
  public void Selectablepage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	   mainpg.click_Selectable();
	  SelectablePage selpage=  PageFactory.initElements(driver, SelectablePage.class);
	  selpage.Select(selpage.item1(),selpage.item3());
	
  }
}
