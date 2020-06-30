package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.DroppablePage;
import Pages.mainPage;

public class Droppable_page extends baseClass {
  @Test
  public void Droppablepage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Droppable();
	  DroppablePage droppage= PageFactory.initElements(driver, DroppablePage.class);
	  droppage.Draganddrop();
  }
}
