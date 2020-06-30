package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AlertPage;
import Pages.mainPage;

public class Alert_Page extends baseClass {
  @Test
  public void Alertpage() {
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Alert();
	  AlertPage alpage=  PageFactory.initElements(driver, AlertPage.class);
	  alpage.Alert_box();
	  alpage.confirm_box();
	  alpage.prompt_box("Selenium");
	  alpage.linebreaktext();
	  alpage.SweetAlert();
  }
}
