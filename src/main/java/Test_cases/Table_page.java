package Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.TablePage;
import Pages.mainPage;

public class Table_page extends baseClass {
  @Test
  public void Tablepage() {
	  
	  mainPage mainpg= PageFactory.initElements(driver, mainPage.class);
	  mainpg.click_Table();
	  TablePage tbpage=  PageFactory.initElements(driver, TablePage.class);
	  tbpage.count_cols();
	  tbpage.count_rows();
	  tbpage.progress();
	  tbpage.maxvalue();
	  tbpage.PrintTable();	  
  }
}
