package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.WindowPage;
import Pages.mainPage;

public class Window_page extends baseClass{
  @Test
  public void Windowpage() {
	  
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Window();
	  WindowPage winpage= PageFactory.initElements(driver, WindowPage.class);
	  winpage.homepage();
	  winpage.findnumberofwindows();
	  winpage.waitforwindows(3);
	  winpage.closeotherthanhome();
	
  }
}
