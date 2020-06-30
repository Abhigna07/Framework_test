package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.buttonPage;
import Pages.mainPage;

public class button_page extends baseClass{
  @Test
  public void ButtonPage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Button();
	  buttonPage btnpage= PageFactory.initElements(driver, buttonPage.class);
	  btnpage.homepageCheck("Button");
  }
  
  @Test
  
  public void locators()
  {
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Button();
	  buttonPage bpg=  PageFactory.initElements(driver, buttonPage.class);
	  bpg.position();
	  bpg.color();
	  bpg.dimensions();
  }
}
