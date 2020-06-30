package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.hyperLinksPage;
import Pages.mainPage;

public class HyperLink_page extends baseClass {
  @Test
  public void Hyperlink() {
	  Common_Methods cmn= new Common_Methods();
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_HyperLink();
	  hyperLinksPage hplink= PageFactory.initElements(driver, hyperLinksPage.class);
	  hplink.Homepage("Hyperlink");
	  mainpg.click_HyperLink();
	  hplink.findurl();
	  hplink.checkbroken();
	  hplink.interact();
	  cmn.sleep(3000);
	  mainpg.mainpage_hyperlink().click();
	  cmn.sleep(3000);
	  hplink.numberoflinks();
	  
  }
}
