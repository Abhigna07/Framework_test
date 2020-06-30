package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.MousehoverPage;
import Pages.mainPage;

public class Mousehover_page extends baseClass {
  @Test
  public void Mousehoverpage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_MouseHover();
	  MousehoverPage mhpage=PageFactory.initElements(driver, MousehoverPage.class);
	  mhpage.printlinks();
	  mhpage.selenium_alert();
	  mhpage.rp_alert();
	  mhpage.WS_alert();
  }
}
