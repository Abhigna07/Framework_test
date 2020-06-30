package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AdvancedWebTablePage;
import Pages.mainPage;

public class AdvancedWebTable_page extends baseClass {
  @Test
  public void AdvancedWebTablepage() {
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_AdvanceWebTable();
	  AdvancedWebTablePage webpage= PageFactory.initElements(driver, AdvancedWebTablePage.class);
	  webpage.check_sort();
  }
}
