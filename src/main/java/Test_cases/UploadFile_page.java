package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.UplaodFilePage;
import Pages.mainPage;

public class UploadFile_page extends baseClass {
  @Test
  public void UploadFilepage() {
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_UplaodFiles();
	  UplaodFilePage upfile=  PageFactory.initElements(driver, UplaodFilePage.class);
	  upfile.uploadfile();
  }
}
