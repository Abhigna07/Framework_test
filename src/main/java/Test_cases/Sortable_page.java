package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.SortablePage;
import Pages.mainPage;

public class Sortable_page extends baseClass {
  @Test
  public void Sortablepage() {
	  

	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Sortable();
	  SortablePage sortpage= PageFactory.initElements(driver, SortablePage.class);
	  sortpage.sortable(sortpage.item7(),-50);
  }
}
