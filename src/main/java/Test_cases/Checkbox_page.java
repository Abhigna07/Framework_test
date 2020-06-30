package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.CheckBoxPage;
import Pages.mainPage;

public class Checkbox_page extends baseClass {
  @Test
  public void Checkboxpage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_CheckBox();
	  CheckBoxPage ccpage= PageFactory.initElements(driver, CheckBoxPage.class);
	  ccpage.Check_Uncheck();
	  ccpage.select_languages();
	  ccpage.confirm_check();
	  ccpage.selectAll();
	  
  }
}
