package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.DropDownPage;
import Pages.mainPage;

public class dropdown_page extends baseClass {
  @Test
  public void dropdownpage() {
	  
	  Common_Methods cm = new Common_Methods();
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_DropDown();
	  DropDownPage ddpage=  PageFactory.initElements(driver, DropDownPage.class);
	  ddpage.select_index(1);
	  ddpage.select_Text("UFT/QTP");
	  ddpage.select_Value("4");
	  ddpage.getnumberofoptions();
	  ddpage.sendtext("Appium");
	  ddpage.select();
  }
}
