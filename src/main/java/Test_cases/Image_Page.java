package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.imagePage;
import Pages.mainPage;

public class Image_Page extends baseClass {
  @Test
  public void ImagePage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Image();
	  imagePage impage= PageFactory.initElements(driver, imagePage.class);
	  impage.homepage("Image");
	  mainpg.click_Image();
	  impage.broken_imagecheck();
	  impage.mouseInteraction("Mouse_img");	  
  }
}
