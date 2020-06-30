package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.editPage;
import Pages.mainPage;

public class edit_Page extends baseClass {
  @Test
  public void EditPage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Edit();
	  editPage edpage=  PageFactory.initElements(driver, editPage.class);
	  edpage.enterEmail();
	  edpage.append();
	  edpage.getText();
	  edpage.clearText();
	  edpage.checkenablement();
  }
}
