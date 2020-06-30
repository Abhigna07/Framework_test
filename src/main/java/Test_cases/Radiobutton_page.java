package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.mainPage;
import Pages.radioPage;

public class Radiobutton_page extends baseClass {
  @Test
  public void Radiobuttonpage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_RadioButton();
	  radioPage radpage= PageFactory.initElements(driver, radioPage.class);
	  radpage.choice();
	  radpage.finddefault();
	  radpage.select_age();
  }
}
