package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.FramesPage;
import Pages.mainPage;

public class Frames_page extends baseClass {
  @Test
  public void Framespage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Frame();
	  FramesPage fmpage=PageFactory.initElements(driver, FramesPage.class);
	  fmpage.frame1();
	  fmpage.Nestedframe();
	  fmpage.numberofframes();
  }
}
