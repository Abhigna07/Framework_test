package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.CalenderPage;
import Pages.mainPage;

public class Calender_page extends baseClass {
  @Test
  public void Calenderpage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Calender();
	  CalenderPage calpage= PageFactory.initElements(driver, CalenderPage.class);
	  calpage.forward_dateselection("july", "2021", 10);
	  calpage.previous_dateselection("may", "2019", 1);
  }
}
