package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.DownloadPage;
import Pages.mainPage;

public class Download_page extends baseClass {
  @Test
  public void Downloadpage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_DownlaodFiles();
	  DownloadPage dwpage= PageFactory.initElements(driver, DownloadPage.class);
	  dwpage.Excel_download();
	  dwpage.pdf_download();
	  dwpage.text_download();
  }
}
