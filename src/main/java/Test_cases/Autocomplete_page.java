package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AutoCompletePage;
import Pages.mainPage;

public class Autocomplete_page extends baseClass{
  @Test
  public void Autocompletepage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_AutoComplete();
	  AutoCompletePage acpage= PageFactory.initElements(driver, AutoCompletePage.class);
	  acpage.entervalue("sele");
  }
}
