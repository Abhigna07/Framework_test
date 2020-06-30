package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.DraggablePage;
import Pages.mainPage;

public class Draggable_page extends baseClass {
  @Test
  public void Draggablepage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Draggable();
	  DraggablePage dragpage= PageFactory.initElements(driver, DraggablePage.class);
	  dragpage.drag(30, 50);
  }
}
